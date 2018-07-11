package com.cn.truth.controller;

import com.cn.truth.Exception.RunException;
import com.cn.truth.VO.NewsCommentVO;
import com.cn.truth.VO.NewsVO;
import com.cn.truth.VO.ResultVO;
import com.cn.truth.VO.UserCommentVO;
import com.cn.truth.converter.NewsCommentInfo2NewsCommentVO;
import com.cn.truth.converter.NewsCommentInfo2UserCommentVO;
import com.cn.truth.converter.NewsInfo2NewsVO;
import com.cn.truth.dataobject.NewsCommentInfo;
import com.cn.truth.dataobject.NewsInfo;
import com.cn.truth.enums.ResultEnum;
import com.cn.truth.form.NewsCommentForm;
import com.cn.truth.service.NewsCommentService;
import com.cn.truth.service.NewsService;
import com.cn.truth.util.ResultVOUtil;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user/news")
@Slf4j
public class UserNewsController {

    @Autowired
    private NewsService newsService;
    @Autowired
    private NewsCommentService newsCommentService;


    //用户上传新闻
    @GetMapping("/create")
    @CachePut(cacheNames = "news", key = "123")
    public NewsVO create(@RequestParam("newsUrl") String newsUrl,
                         @RequestParam(value = "newsType", defaultValue = "0") Integer newsType) {
        NewsInfo news = new NewsInfo();
        news.setNewsUrl(newsUrl);
        news.setNewsType(newsType);
        NewsInfo result = newsService.create(news);
        if (result != null) {
            NewsVO newsVO = new NewsVO();
            newsVO.setNewsUrl(result.getNewsUrl());
            newsVO.setNewsCreateTime(result.getNewsCreateTime());
            return newsVO;
        } else {
            log.error("【上传新闻】 上传失败");
            throw new RunException(ResultEnum.UPLOAD_FAIL);
        }
    }

    //用户获取待处理新闻
    @GetMapping("/list")
    @Cacheable(cacheNames = "news", key = "123")
    public ResultVO list(){
        List<NewsInfo> newsInfoList = new ArrayList<>();
        newsInfoList = newsService.selectUnsolvedNews();
        List<NewsVO> newsVOList = NewsInfo2NewsVO.convert(newsInfoList);
        return ResultVOUtil.success(newsVOList);
    }

    //用户发表评论
    @PostMapping("/comment")
    @CachePut(cacheNames = "news", key = "123")
    public NewsCommentVO comment(@Valid NewsCommentForm newsCommentForm,
                                 BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            log.error("【添加评论】 评论失败");
            throw new RunException(ResultEnum.COMMENT_FAIL);
        }
        NewsCommentInfo newsComment = new NewsCommentInfo();
        newsComment.setComment(newsCommentForm.getComment());
        newsComment.setNewsId(newsCommentForm.getNewsId());
        newsComment.setNewsUrl(newsCommentForm.getNewsUrl());
        newsComment.setUserOpenid(newsCommentForm.getUserOpenid());
        NewsCommentInfo result = newsCommentService.create(newsComment);
        NewsCommentVO newsCommentVO = NewsCommentInfo2NewsCommentVO.convert(result);
        return newsCommentVO;
    }

    //获取新闻评论
    @GetMapping("/getNewsComment")
    @Cacheable(cacheNames = "news", key = "123")
    public List<NewsCommentVO> getNewsComment(@RequestParam("newsId") Integer newsOpenid) {
       List<NewsCommentInfo> newsCommentInfoList = new ArrayList<>();
       newsCommentInfoList = newsCommentService.newsCommentList(newsOpenid);
       List<NewsCommentVO> result = new ArrayList<>();
       result = NewsCommentInfo2NewsCommentVO.convert(newsCommentInfoList);
       return result;
    }

    //获取用户评论历史
    @GetMapping("/getUserComment")
    @Cacheable(cacheNames = "news", key = "123")
    public List<UserCommentVO> getUserComment(@RequestParam("userOpenid") String userOpenid) {
        if(userOpenid.isEmpty()) {
            log.error("【用户评论】 用户openid为空");
            throw new RunException(ResultEnum.PARAM_ERROR);
        }
        List<NewsCommentInfo> newsCommentInfoList = newsCommentService.userCommentList(userOpenid);
        if(newsCommentInfoList.isEmpty()) {
            log.error("【用户评论】查询失败");
            throw new RunException(ResultEnum.FIND_FAIL);
        }
        List<UserCommentVO> userCommentVOList = new ArrayList<>();
        userCommentVOList = NewsCommentInfo2UserCommentVO.convert(newsCommentInfoList);
        return userCommentVOList;
    }

    //用户删除评论
    @GetMapping("/deleteComment")
    @CacheEvict(cacheNames = "news", key = "123")
    public void deleteComment(@RequestParam("commentId") Integer commentId) {
        if(commentId == null) {
            log.error("【删除评论】 评论Id为空");
            throw new RunException(ResultEnum.PARAM_ERROR);
        }
        try {
            newsCommentService.delete(commentId);
            System.out.println("删除成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}





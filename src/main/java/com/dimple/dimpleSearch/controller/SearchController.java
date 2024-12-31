package com.dimple.dimpleSearch.controller;

import com.dimple.dimpleSearch.common.BaseResponse;
import com.dimple.dimpleSearch.common.ResultUtils;
import com.dimple.dimpleSearch.manager.SearchFacade;
import com.dimple.dimpleSearch.model.dto.search.SearchRequest;
import com.dimple.dimpleSearch.model.vo.SearchVO;
import com.dimple.dimpleSearch.service.PictureService;
import com.dimple.dimpleSearch.service.PostService;
import com.dimple.dimpleSearch.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
* @author dimple
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private UserService userService;

    @Resource
    private PostService postService;

    @Resource
    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }

}

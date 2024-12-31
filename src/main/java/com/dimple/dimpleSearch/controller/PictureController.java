package com.dimple.dimpleSearch.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dimple.dimpleSearch.common.BaseResponse;
import com.dimple.dimpleSearch.common.ErrorCode;
import com.dimple.dimpleSearch.common.ResultUtils;
import com.dimple.dimpleSearch.exception.ThrowUtils;
import com.dimple.dimpleSearch.model.dto.picture.PictureQueryRequest;
import com.dimple.dimpleSearch.model.entity.Picture;
import com.dimple.dimpleSearch.service.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
* @author dimple
 */
@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Resource
    private PictureService pictureService;

    /**
     * 分页获取列表（封装类）
     *
     * @param pictureQueryRequest
     * @param request
     * @return
     */
    @PostMapping("/list/page/vo")
    public BaseResponse<Page<Picture>> listPictureByPage(@RequestBody PictureQueryRequest pictureQueryRequest,
                                                        HttpServletRequest request) {
        long current = pictureQueryRequest.getCurrent();
        long size = pictureQueryRequest.getPageSize();
        // 限制爬虫
        ThrowUtils.throwIf(size > 20, ErrorCode.PARAMS_ERROR);
        String searchText = pictureQueryRequest.getSearchText();
        Page<Picture> picturePage = pictureService.searchPicture(searchText, current, size);
        return ResultUtils.success(picturePage);
    }


}

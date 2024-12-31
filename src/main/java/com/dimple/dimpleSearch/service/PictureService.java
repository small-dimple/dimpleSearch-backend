package com.dimple.dimpleSearch.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dimple.dimpleSearch.model.entity.Picture;

/**
 * 图片服务
 *
* @author dimple
 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}

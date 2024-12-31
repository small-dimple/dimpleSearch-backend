package com.dimple.dimpleSearch.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 图片
 *
* @author dimple
 */
@Data
public class Picture implements Serializable {

    private String title;

    private String url;

    private static final long serialVersionUID = 1L;

}

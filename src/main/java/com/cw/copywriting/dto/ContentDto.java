package com.cw.copywriting.dto;

import lombok.Data;

@Data
public class ContentDto {

    private int id;

    private int type;

    private String content;

    private String imageUrl;

    private String datetime;

    private String tag;


}
package com.cw.copywriting.controller;

import com.cw.copywriting.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Liao ziyang
 * @date 2020/3/26
 * @desc
 */
@RestController
@RequestMapping(value = "/content")
public class ContentController {

    @Autowired
    private ContentService contentService;
}

package com.cw.copywriting.controller;

import com.cw.copywriting.common.Response;
import com.cw.copywriting.dto.ContentDto;
import com.cw.copywriting.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping(value = "/add")
    public Response<?> add(@RequestBody ContentDto content) {
        contentService.addWA(content);
        return Response.success();
    }

    @GetMapping(value = "/list")
    public Response<?> list(@RequestBody ContentDto content) {
        //todo 
        contentService.addWA(content);
        return Response.success();
    }
}

package com.cw.copywriting.service;

import com.cw.copywriting.dao.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Liao ziyang
 * @date 2020/3/26
 * @desc
 */
@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;
}

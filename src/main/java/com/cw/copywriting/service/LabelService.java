package com.cw.copywriting.service;

import com.cw.copywriting.dao.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Liao ziyang
 * @date 2020/3/26
 * @desc
 */
@Service
public class LabelService {

    @Autowired
    private LabelRepository labelRepository;


}

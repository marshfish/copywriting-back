package com.cw.copywriting.service;

import com.cw.copywriting.bean.ContentBean;
import com.cw.copywriting.bean.LabelBean;
import com.cw.copywriting.bean.LabelContentRelBean;
import com.cw.copywriting.dao.ContentRepository;
import com.cw.copywriting.dao.LabelContentRelRepository;
import com.cw.copywriting.dao.LabelRepository;
import com.cw.copywriting.dto.ContentDto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
    @Autowired
    private LabelRepository labelRepository;
    @Autowired
    private LabelContentRelRepository labelContentRelRepository;

    public void addWA(ContentDto content) {
        ContentBean contentBean = new ContentBean();
        contentBean.setContent(content.getContent());
        contentRepository.findOne(Example.of(contentBean)).ifPresent(e -> {
            throw new RuntimeException("文案已重复");
        });
        ContentBean dataObj = new ContentBean();
        BeanUtils.copyProperties(content, dataObj);
        dataObj = contentRepository.save(dataObj);

        LabelBean qo = new LabelBean();
        qo.setLabelName(content.getTag());
        LabelBean thisLabel = labelRepository.findOne(Example.of(qo)).orElseGet(() -> labelRepository.save(qo));
        LabelContentRelBean rel = new LabelContentRelBean();
        rel.setLabel_id(thisLabel.getId());
        rel.setContentId(dataObj.getId());
        labelContentRelRepository.save(rel);
    }
}

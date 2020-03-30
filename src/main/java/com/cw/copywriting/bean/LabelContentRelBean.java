package com.cw.copywriting.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @auther Liao ziyang
 * @date 2020/3/26
 * @desc
 */
@Entity
@Data
@Table(name = "label_content_rel")
public class LabelContentRelBean {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "content_id")
    private int contentId;

    @Column(name = "label_id")
    private int label_id;
}

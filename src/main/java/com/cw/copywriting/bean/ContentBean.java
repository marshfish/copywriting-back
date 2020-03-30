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
@Table(name = "content")
public class ContentBean {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "type")
    private int type;

    @Column(name = "content")
    private String content;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "datetime")
    private String datetime;
}

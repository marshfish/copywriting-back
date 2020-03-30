package com.cw.copywriting.dao;

import com.cw.copywriting.bean.ContentBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @auther Liao ziyang
 * @date 2018/8/21
 * @desc
 */
@Repository
public interface ContentRepository extends JpaRepository<ContentBean, Long> {


}

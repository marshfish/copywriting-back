package com.cw.copywriting.dao;

import com.cw.copywriting.bean.ContentBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @auther Liao ziyang
 * @date 2018/8/21
 * @desc
 */
@Repository
public interface ContentRepository extends JpaRepository<ContentBean, Long> {

    // @Query(value = "SELECT DISTINCT c.* FROM content c "
    //         + "where c.id in (SELECT lcr.content_id from label_content_rel lcr where lcr.label_id = 1 or c.content LIKE '%:like%'' LIMIT 0, 10")
    // ContentBean findList(@Param("like")String like);

}

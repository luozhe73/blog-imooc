package com.demo.blog.repository.es;

import com.demo.blog.domain.es.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String> {

    /**
     * 根据用户名分页查询用户列表
     *
     * @return
     */
    Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(String title, String summary, String content,Pageable pageable);
}

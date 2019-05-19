package com.demo.blog.domain.es;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.io.Serializable;

@Document(indexName = "blog",type = "blog")
@Data
@ToString
public class EsBlog implements Serializable {

    @Id
    private String id;

    private String title;

    private String summary;

    private String content;

    protected EsBlog(){//JPA规范要求,防止直接使用

    }

    public EsBlog(String title,String summary,String content){
        this.title=title;
        this.summary=summary;
        this.content=content;
    }
}

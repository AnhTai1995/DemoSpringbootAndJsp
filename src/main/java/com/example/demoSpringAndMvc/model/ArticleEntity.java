package com.example.demoSpringAndMvc.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * ArticleEntity entity
 *
 * @author TaiNa
 */
@Entity
@Table(name="articles")
@Data
public class ArticleEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="article_id")
    private Integer articleId;

    @Column(name="title")
    private String title;

    @Column(name="category")
    private String category;
}

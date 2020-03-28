package com.example.demoSpringAndMvc.services;

import com.example.demoSpringAndMvc.dto.ArticleDto;
import com.example.demoSpringAndMvc.form.ArticleForm;
import com.example.demoSpringAndMvc.model.ArticleEntity;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 * ArticleEntity service interface
 *
 * @author TuMV
 */
public interface ArticleService {

    /**
     * Get all article
     *
     * @author TaiNa
     * @return list article
     */
    ResponseEntity<List<ArticleEntity>> getAllArticle();

    /**
     * Get article by id
     *
     * @author TaiNa
     * @param articleId
     * @return ArticleEntity
     */
    ResponseEntity<ArticleEntity> getArticleById(Integer articleId);

    /**
     * Add new article
     *
     * @author TaiNa
     * @param article
     * @return
     */
    boolean addArticle(ArticleForm article) throws Exception;


}

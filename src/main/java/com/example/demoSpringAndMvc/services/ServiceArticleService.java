package com.example.demoSpringAndMvc.services;

import com.example.demoSpringAndMvc.model.Article;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * Article service interface
 *
 * @author TuMV
 */
@Transactional
public interface ServiceArticleService {

    /**
     * Get all article
     *
     * @author TuMV
     * @return list article
     */
    ResponseEntity<List<Article>> getAllArticle();

    /**
     * Get article by id
     *
     * @author TuMV
     * @param articleId
     * @return Article
     */
    ResponseEntity<Article> getArticleById(int articleId);

    /**
     * Add new article
     *
     * @author TuMV
     * @param article
     * @return
     */
    boolean addArticle(Article article) throws Exception;


}

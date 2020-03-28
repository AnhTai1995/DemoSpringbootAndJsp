package com.example.demoSpringAndMvc.controller;

import com.example.demoSpringAndMvc.constant.ArticleConst;
import com.example.demoSpringAndMvc.form.ArticleForm;
import com.example.demoSpringAndMvc.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Articles
 *
 * @author TaiNa
 */
@RestController
@RequestMapping(ArticleConst.BASE_API_ARTICLE_URL)
public class ArticleController {

    @Autowired
    private ArticleService serviceArticleService;

    /**
     * Get all articles
     *
     * @author TaiNa
     * @return all articles
     */
    @GetMapping(ArticleConst.BASE_API_GET_ARTICLE_URL)
    public ResponseEntity<?> getAllArticles() {
        return serviceArticleService.getAllArticle();
    }

    /**
     * Get all articles
     *
     * @author TaiNa
     * @return find articles by id
     */
    @GetMapping(ArticleConst.BASE_API_GET_ARTICLE_BY_ID)
    public ResponseEntity<?> getArticlesById(@RequestParam(name = "id") Integer artId) {
        return serviceArticleService.getArticleById(artId);
    }

    /**
     * Create new articles, demo method Post
     *
     * @author TaiNa
     * @param articleForm
     * @return status success or fail
     * @throws Exception
     */
    @PostMapping(ArticleConst.BASE_API_ADD_ARTICLE_URL)
    public ResponseEntity createArticle(@RequestBody ArticleForm articleForm) throws Exception{
        if (serviceArticleService.addArticle(articleForm)) {
            return ResponseEntity.ok(HttpStatus.OK);
        }
        return ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);
    }


}

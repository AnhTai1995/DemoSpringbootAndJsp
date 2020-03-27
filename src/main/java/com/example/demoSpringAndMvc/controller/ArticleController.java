package com.example.demoSpringAndMvc.controller;

import com.example.demoSpringAndMvc.constant.ServiceArticleConst;
import com.example.demoSpringAndMvc.form.ArticleForm;
import com.example.demoSpringAndMvc.model.Article;
import com.example.demoSpringAndMvc.services.ServiceArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Articles
 *
 * @author TaiNa
 */
@RestController
@RequestMapping(ServiceArticleConst.BASE_API_ARTICLE_URL)
public class ArticleController {

    @Autowired
    private ServiceArticleService serviceArticleService;

    /**
     * Get all articles
     *
     * @author TaiNa
     * @return all articles
     */
    @GetMapping(ServiceArticleConst.BASE_API_GET_ARTICLE_URL)
    public ResponseEntity<?> getAllArticles() {
        return serviceArticleService.getAllArticle();
    }

    /**
     * Create new articles
     *
     * @author TaiNa
     * @param articleForm
     * @return status success or fail
     * @throws Exception
     */
    @PostMapping(ServiceArticleConst.BASE_API_ADD_ARTICLE_URL)
    public ResponseEntity createArticle(@RequestBody ArticleForm articleForm) throws Exception{
        Article article = new Article();
        article.setTitle(articleForm.getTitle());
        article.setCategory(articleForm.getCategory());
        if (serviceArticleService.addArticle(article)) {
            return ResponseEntity.ok(HttpStatus.OK);
        }
        return ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);
    }


}

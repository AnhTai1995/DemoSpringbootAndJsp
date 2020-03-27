package com.example.demoSpringAndMvc.services.Impl;

import com.example.demoSpringAndMvc.model.Article;
import com.example.demoSpringAndMvc.services.ServiceArticleService;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Article service implement article service interface
 *
 * @author TuMV
 */
@Service
public class ServiceArticleServiceImpl implements ServiceArticleService {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Get all articles
     *
     * @author TuMV
     * @return list comment
     */
    @Override
    public ResponseEntity<List<Article>> getAllArticle() {
        String strSql;
        strSql = "FROM Article as atcl ORDER BY atcl.articleId";
        List<Article> articleList = (List<Article>) entityManager.createQuery(strSql).getResultList();
        return ResponseEntity.ok(articleList);
    }

    /**
     * Get article by id
     *
     * @author TuMV
     * @param articleId
     * @return article
     */
    @Override
    public ResponseEntity<Article> getArticleById(int articleId) {
        Article article = entityManager.find(Article.class, articleId);
        return ResponseEntity.ok(article);
    }

    /**
     * Create new article
     *
     * @author TuMV
     * @param article
     * @return status success or fail
     * @throws SQLException
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addArticle(Article article) throws SQLException {
        try {
            entityManager.persist(article);
            return true;
            // Test rollback transactional
            //throw new Exception();
        } catch (Exception ex) {
            throw new SQLException();
        }
    }

}

package com.example.demoSpringAndMvc.services.Impl;

import com.example.demoSpringAndMvc.form.ArticleForm;
import com.example.demoSpringAndMvc.model.ArticleEntity;
import com.example.demoSpringAndMvc.repository.ArticleRepository;
import com.example.demoSpringAndMvc.services.ArticleService;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * ArticleEntity service implement article service interface
 *
 * @author TaiNa
 */
@Service
public class ArticleServiceImpl implements ArticleService {

  @Autowired
  private ArticleRepository articleRepository;

  /**
   * Get all articles
   *
   * @return list comment
   * @author TaiNa
   */
  @Override
  public ResponseEntity<List<ArticleEntity>> getAllArticle() {
    List<ArticleEntity> articleList = this.articleRepository.findAll();
    return ResponseEntity.ok(articleList);
  }

  /**
   * Get article by id
   *
   * @return article
   * @author TaiNa
   */
  @Override
  public ResponseEntity<ArticleEntity> getArticleById(Integer articleId) {
    Optional<ArticleEntity> article = this.articleRepository.findById(articleId);
    return ResponseEntity.ok(article.get());
  }

  /**
   * Create new article
   *
   * @return status success or fail
   * @author TaiNa
   */
  @Override
  @Transactional(rollbackFor = Exception.class)
  public boolean addArticle(ArticleForm articleForm) throws SQLException {
    try {
      //Get max id of table
      Integer newId = this.articleRepository.getMaxId() + 1;

      //Handle save entity
      ArticleEntity article = new ArticleEntity();
      article.setArticleId(newId);
      article.setTitle(articleForm.getTitle());
      article.setCategory(articleForm.getCategory());
      this.articleRepository.save(article);
      return true;

    } catch (Exception ex) {
      throw new SQLException();
    }
  }

}

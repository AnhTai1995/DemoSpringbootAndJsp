package com.example.demoSpringAndMvc.repository;

import com.example.demoSpringAndMvc.model.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer>,
    JpaSpecificationExecutor<ArticleEntity> {

  @Query(value = "SELECT max(articleId) FROM ArticleEntity ")
  Integer getMaxId();

}

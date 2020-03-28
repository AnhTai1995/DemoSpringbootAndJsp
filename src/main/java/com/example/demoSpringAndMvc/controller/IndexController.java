package com.example.demoSpringAndMvc.controller;

import com.example.demoSpringAndMvc.constant.IndexConst;
import com.example.demoSpringAndMvc.model.ArticleEntity;
import com.example.demoSpringAndMvc.repository.ArticleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
  @Autowired
  private ArticleRepository articleRepository;

  /**
   * Controller: home-page
   * @param model
   * @return
   */
  @RequestMapping(value = {IndexConst.API_HOME, IndexConst.API_INDEX }, method = RequestMethod.GET)
  public String indexController(Model model) {

    String message = "Hello Spring Boot + JSP";

    model.addAttribute("message", message);

    return "index";
  }

  /**
   * Controller: next page
   * @param model
   * @return
   */
  @RequestMapping(value = IndexConst.API_NEXT, method = RequestMethod.GET)
  public String nextController(Model model) {

    String message = "Wellcome to next page !";

    model.addAttribute("message", message);

    return "next";
  }

  /**
   * Demo render list Entity with JSP
   * @param model
   * @return
   */
  @RequestMapping(value = IndexConst.ARTICLE_LIST_JSP, method = RequestMethod.GET)
  public String getListArticleJsp(Model model) {

    List<ArticleEntity> articleList = this.articleRepository.findAll();

    model.addAttribute("article", articleList);

    return "articlesList";
  }

}

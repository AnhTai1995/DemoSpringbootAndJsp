package com.example.demoSpringAndMvc.controller;

import com.example.demoSpringAndMvc.constant.CommonConst;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

  /**
   * Controller: home-page
   * @param model
   * @return
   */
  @RequestMapping(value = {CommonConst.API_HOME,CommonConst.API_INDEX }, method = RequestMethod.GET)
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
  @RequestMapping(value = CommonConst.API_NEXT, method = RequestMethod.GET)
  public String nextController(Model model) {

    String message = "Wellcome to next page !";

    model.addAttribute("message", message);

    return "next";
  }
}

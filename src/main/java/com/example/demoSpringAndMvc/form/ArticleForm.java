package com.example.demoSpringAndMvc.form;

import lombok.Data;

/**
 * ArticleEntity form to mapping request's param
 *
 * @author TuMV
 */
@Data
public class ArticleForm {

    private String title;

    private String category;

}

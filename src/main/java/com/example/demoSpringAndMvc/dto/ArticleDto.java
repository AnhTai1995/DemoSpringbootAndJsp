package com.example.demoSpringAndMvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ArticleEntity DTO
 *
 * @author TuMV
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {

    private String title;

    private String category;

}

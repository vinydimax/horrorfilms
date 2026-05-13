package com.horrorfilms.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class MovieDTO {
    private Long id;
    private String title;
    private String overview;
    private String posterUrl;
    private Double rating;
    private Integer voteCount;
    private String releaseDate;
    private String releaseYear;


}

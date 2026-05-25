package com.horrorfilms.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


@Data
public class TmdbResponseDTO {

    private Integer page;
    private List<TmdbMovieDto> results;

    @JsonProperty("total_results")
    private Integer totalResults;

    @JsonProperty("total_pages")
    private Integer totalPages;

    @Data
    public static class TmdbMovieDTO{
        private Long id;
        private String title;
        private String overview;

        @JsonProperty("poster_path")
        private String posterPath;

        @JsonProperty("vote_average")
        private String voteAverage;

        @JsonProperty("vote_count")
        private Integer voteCount;

        @JsonProperty("release_date")
        private String releaseDate;



    }



}

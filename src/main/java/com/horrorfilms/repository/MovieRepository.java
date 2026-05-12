package com.horrorfilms.repository;

import com.horrorfilms.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.time.LocalDateTime;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContainingIgnoreCase(String title);
    List<Movie> findTop20ByOrderByVoteAverageDesc();
    boolean existsByTmdbIdAndCachedAtAfter(Long tmdbId, LocalDateTime after);


}

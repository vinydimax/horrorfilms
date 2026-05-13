package com.horrorfilms.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;


@Entity
@Table(name = "search_history")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SearchHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String query;

    @Column
    private Integer resultCount;

    @Column(name = "searched_at")
    private LocalDateTime searchedAt;

    @Column
    private String ipAddress;

    @PrePersist
    public void prePersist(){
        this.searchedAt = LocalDateTime.now;
    }


}

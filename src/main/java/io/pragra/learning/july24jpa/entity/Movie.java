package io.pragra.learning.july24jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CINEMA")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movieId;

    private String movieName;

    private String releaseYear;

    @NonNull
    @Column(name = "GENRE",length = 5)
    private String genre;


    @OneToOne
    private Review review;

    @OneToMany
    private List<CastDetail> castDetails; // NF 1 -6
}

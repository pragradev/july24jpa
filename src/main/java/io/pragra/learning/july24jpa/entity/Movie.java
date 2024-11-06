package io.pragra.learning.july24jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CINEMA")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer movieId;
    @Column(name = "CINEMA_NAME", unique = true, nullable = false)
    private String movieName;
    @NonNull
    @Column(name = "GENRE",length = 5)
    private String genre;

    private String releaseYear;

    @OneToOne
    private Review review;
}

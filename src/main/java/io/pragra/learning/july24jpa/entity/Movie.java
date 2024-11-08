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

    @EmbeddedId
    private MovieEmbdId movieEmbdId;

    @NonNull
    @Column(name = "GENRE",length = 5)
    private String genre;


    @OneToOne
    private Review review;

    @OneToMany
    private List<CastDetail> castDetails; // NF 1 -6
}

package io.pragra.learning.july24jpa.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
public class MovieEmbdId implements Serializable {
    private String movieName;
    private String releaseYear;
}

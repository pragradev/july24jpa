package io.pragra.learning.july24jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class CastDetail {
    @Id
    private Integer castId;
    private String firstName;
    private String lastName;
    @ManyToOne
    private Movie movie;
}

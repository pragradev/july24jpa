package io.pragra.learning.july24jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class CastDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer castId;
    private String firstName;
    private String lastName;
}

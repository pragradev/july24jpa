package io.pragra.learning.july24jpa.repo;

import io.pragra.learning.july24jpa.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface MovieRepo extends JpaRepository<Movie, Integer> {
}

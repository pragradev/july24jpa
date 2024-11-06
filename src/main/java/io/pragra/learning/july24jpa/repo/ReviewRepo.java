package io.pragra.learning.july24jpa.repo;

import io.pragra.learning.july24jpa.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {
}

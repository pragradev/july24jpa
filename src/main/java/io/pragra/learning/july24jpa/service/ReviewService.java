package io.pragra.learning.july24jpa.service;

import io.pragra.learning.july24jpa.entity.Review;
import io.pragra.learning.july24jpa.repo.ReviewRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
public class ReviewService {
    final ReviewRepo reviewRepo;

    public Review insertReview(Review review){
        return reviewRepo.save(review);
    }

    public Optional<Review> getReviewById(Long id){
        return reviewRepo.findById(id);
    }
}

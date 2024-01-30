package com.feedbacks.main.repositories;

import com.feedbacks.main.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reviewRepository extends JpaRepository<Review, Integer> {
}

package com.feedbacks.main.services.interfaces;

import com.feedbacks.main.dtos.review.RequestReviewDTO;
import com.feedbacks.main.dtos.review.ReviewDTO;
import com.feedbacks.main.services.Service;

public interface ReviewService extends Service<ReviewDTO, RequestReviewDTO, Integer> {
}

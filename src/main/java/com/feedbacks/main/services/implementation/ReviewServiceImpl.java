package com.feedbacks.main.services.implementation;

import com.feedbacks.main.dtos.review.RequestReviewDTO;
import com.feedbacks.main.dtos.review.ReviewDTO;
import com.feedbacks.main.entities.Review;
import com.feedbacks.main.exceptions.NotFoundException;
import com.feedbacks.main.repositories.ReviewRepository;
import com.feedbacks.main.repositories.UserRepository;
import com.feedbacks.main.services.interfaces.ReviewService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ModelMapper modelMapper;
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    @Override
    public List<ReviewDTO> findAll() {
        log.info("Retrieving all reviews");
        return List.of(modelMapper.map(reviewRepository.findAll(), ReviewDTO[].class));
    }

    @Override
    public ReviewDTO findById(Integer integer) throws NotFoundException {
        log.info("Checking if the review with the id of {} exists", integer);
        Review review = reviewRepository.findById(integer)
                .orElseThrow(() -> new NotFoundException("Review not found"));
        log.info("Retrieving the found review");
        return modelMapper.map(review, ReviewDTO.class);
    }

    @Override
    public ReviewDTO save(RequestReviewDTO object) throws NotFoundException {
        log.info("Mapping the new review");
        Review review = modelMapper.map(object, Review.class);
        review.setUser(
                userRepository.findById(object.getUser_id())
                        .orElseThrow(() -> new NotFoundException("User not found"))
        );
        log.info("Saving the new review with the title {}", review.getTitle());
        return modelMapper.map(reviewRepository.save(review), ReviewDTO.class);
    }

    @Override
    public ReviewDTO update(Integer integer, RequestReviewDTO newObject) throws NotFoundException {
        return null;
    }

    @Override
    public boolean delete(Integer integer) throws NotFoundException {
        log.info("Checking if the review with the id of {} exists", integer);
        Review review = reviewRepository.findById(integer)
                .orElseThrow(() -> new NotFoundException("Review not found"));
        log.info("Deleting if the review with the id of {} exists", integer);
        reviewRepository.delete(review);
        return true;
    }
}

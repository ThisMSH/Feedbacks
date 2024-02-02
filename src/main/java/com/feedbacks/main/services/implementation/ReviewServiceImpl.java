package com.feedbacks.main.services.implementation;

import com.feedbacks.main.dtos.review.RequestReviewDTO;
import com.feedbacks.main.dtos.review.ReviewDTO;
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
        return null;
    }

    @Override
    public ReviewDTO findById(Integer integer) {
        return null;
    }

    @Override
    public ReviewDTO save(RequestReviewDTO object) {
        return null;
    }

    @Override
    public ReviewDTO update(Integer integer, RequestReviewDTO newObject) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}

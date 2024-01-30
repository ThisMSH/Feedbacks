package com.feedbacks.main.services.implementation;

import com.feedbacks.main.dtos.ReviewDTO;
import com.feedbacks.main.repositories.ReviewRepository;
import com.feedbacks.main.services.ReviewService;
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
    @Override
    public List<ReviewDTO> findAll() {
        return null;
    }

    @Override
    public ReviewDTO findById(Integer integer) {
        return null;
    }

    @Override
    public ReviewDTO save(ReviewDTO object) {
        return null;
    }

    @Override
    public ReviewDTO update(Integer integer, ReviewDTO newObject) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}

package com.feedbacks.main.services.implementation;

import com.feedbacks.main.dtos.ReactionDTO;
import com.feedbacks.main.exceptions.NotFoundException;
import com.feedbacks.main.repositories.ReactionRepository;
import com.feedbacks.main.repositories.ReviewRepository;
import com.feedbacks.main.repositories.UserRepository;
import com.feedbacks.main.services.interfaces.ReactionService;
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
public class ReactionServiceImpl implements ReactionService {
    private final ModelMapper modelMapper;
    private final ReactionRepository reactionRepository;
    private final UserRepository userRepository;
    private final ReviewRepository reviewRepository;
    @Override
    public List<ReactionDTO> findAll() {
        return null;
    }

    @Override
    public ReactionDTO findById(Integer integer) {
        return null;
    }

    @Override
    public ReactionDTO save(ReactionDTO object) {
        return null;
    }

    @Override
    public ReactionDTO update(Integer integer, ReactionDTO newObject) throws NotFoundException {
        return null;
    }

    @Override
    public boolean delete(Integer integer) throws NotFoundException {
        return false;
    }
}

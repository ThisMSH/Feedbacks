package com.feedbacks.main.services.implementation;

import com.feedbacks.main.dtos.ReactionDTO;
import com.feedbacks.main.services.interfaces.ReactionService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class ReactionServiceImpl implements ReactionService {
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
    public ReactionDTO update(Integer integer, ReactionDTO newObject) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}

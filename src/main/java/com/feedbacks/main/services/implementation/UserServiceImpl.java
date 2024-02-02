package com.feedbacks.main.services.implementation;

import com.feedbacks.main.dtos.user.RequestUserDTO;
import com.feedbacks.main.dtos.user.UserDTO;
import com.feedbacks.main.services.interfaces.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public UserDTO findById(Integer integer) {
        return null;
    }

    @Override
    public UserDTO save(RequestUserDTO object) {
        return null;
    }

    @Override
    public UserDTO update(Integer integer, RequestUserDTO newObject) {
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}

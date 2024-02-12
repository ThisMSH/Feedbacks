package com.feedbacks.main.services.implementation;

import com.feedbacks.main.dtos.user.RequestUserDTO;
import com.feedbacks.main.dtos.user.UserDTO;
import com.feedbacks.main.entities.User;
import com.feedbacks.main.exceptions.NotFoundException;
import com.feedbacks.main.repositories.UserRepository;
import com.feedbacks.main.services.interfaces.UserService;
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
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    @Override
    public List<UserDTO> findAll() {
        log.info("Retrieving all users");
        return List.of(modelMapper.map(userRepository.findAll(), UserDTO[].class));
    }

    @Override
    public UserDTO findById(Integer integer) throws NotFoundException {
        log.info("Checking if the user with the id of {} exists", integer);
        User user = userRepository.findById(integer)
                .orElseThrow(() -> new NotFoundException("user not found"));
        log.info("Retrieving the found user");
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public UserDTO save(RequestUserDTO object) {
        log.info("Mapping the new user");
        User user = modelMapper.map(object, User.class);
        log.info("Saving / registering the new user with the name {}", user.getFirstname());
        return modelMapper.map(userRepository.save(user), UserDTO.class);
    }

    @Override
    public UserDTO update(Integer integer, RequestUserDTO newObject) throws NotFoundException {
        return null;
    }

    @Override
    public boolean delete(Integer integer) throws NotFoundException {
        return false;
    }
}

package com.feedbacks.main.services.interfaces;

import com.feedbacks.main.dtos.user.RequestUserDTO;
import com.feedbacks.main.dtos.user.UserDTO;
import com.feedbacks.main.services.Service;

public interface UserService extends Service<UserDTO, RequestUserDTO, Integer> {
}

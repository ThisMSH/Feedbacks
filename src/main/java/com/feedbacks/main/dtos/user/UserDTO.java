package com.feedbacks.main.dtos.user;

import com.feedbacks.main.dtos.ReactionDTO;
import com.feedbacks.main.dtos.review.RequestReviewDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Getters, Setters, Constructors, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private List<RequestReviewDTO> reviews;
    private List<ReactionDTO> reactions;
}

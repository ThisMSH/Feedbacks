package com.feedbacks.main.dtos.review;

import com.feedbacks.main.dtos.ReactionDTO;
import com.feedbacks.main.dtos.user.RequestUserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

// Getters, Setters, Constructors, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {
    private int id;
    private LocalDate date;
    private String title;
    private String message;
    private RequestUserDTO user;
    private List<ReactionDTO> reactions;
}

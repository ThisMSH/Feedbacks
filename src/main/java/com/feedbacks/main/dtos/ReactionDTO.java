package com.feedbacks.main.dtos;

import com.feedbacks.main.enums.ReactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Getters, Setters, Constructors, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReactionDTO {
    private int id;
    private ReactionType reaction;
    private int user_id;
    private int review_id;
}

package com.feedbacks.main.dtos.review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Getters, Setters, Constructors, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestReviewDTO {
    private LocalDate date;
    private String title;
    private String message;
    private int user_id;
}

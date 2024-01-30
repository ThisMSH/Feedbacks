package com.feedbacks.main.dtos;

import com.feedbacks.main.enums.Reaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Getters, Setters, Constructors, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {
    private int id;
    private LocalDate date;
    private String title;
    private String message;
    private Reaction reaction;
}

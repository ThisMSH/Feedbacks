package com.feedbacks.main.dtos.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Getters, Setters, Constructors, toString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestUserDTO {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}

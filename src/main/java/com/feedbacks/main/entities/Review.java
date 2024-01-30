package com.feedbacks.main.entities;

import com.feedbacks.main.enums.Reaction;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Getters, Setters, Constructors, toString
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Review {
    @Id
    @SequenceGenerator(
            name = "review_id_sequence",
            sequenceName = "review_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "review_id_sequence"
    )
    private int id;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String message;
    @Enumerated(EnumType.STRING)
    private Reaction reaction;
}

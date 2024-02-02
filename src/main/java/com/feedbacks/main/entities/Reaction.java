package com.feedbacks.main.entities;

import com.feedbacks.main.enums.ReactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Getters, Setters, Constructors, toString
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Reaction {
    @Id
    @SequenceGenerator(
            name = "reaction_id_sequence",
            sequenceName = "reaction_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reaction_id_sequence"
    )
    private int id;
    @Enumerated(EnumType.STRING)
    private ReactionType reaction;
    @ManyToOne
    private Review review;
    @ManyToOne
    private User user;
}

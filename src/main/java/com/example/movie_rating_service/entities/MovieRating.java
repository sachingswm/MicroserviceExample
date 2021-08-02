package com.example.movie_rating_service.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class MovieRating {
    @Id
    @GeneratedValue
    private Long movieRatingId;
    private int rating;
    @ManyToOne(cascade = CascadeType.ALL)
    private Movie movie;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
}

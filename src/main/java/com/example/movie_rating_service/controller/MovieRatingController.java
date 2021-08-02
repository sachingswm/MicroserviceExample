package com.example.movie_rating_service.controller;

import com.example.movie_rating_service.entities.MovieRating;
import com.example.movie_rating_service.entities.User;
import com.example.movie_rating_service.services.MovieRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movieRating")
public class MovieRatingController {
    @Autowired
    private MovieRatingService movieRatingService;

    @GetMapping("/{userId}")
    public List<MovieRating> getAllMovieRating(@PathVariable Long userId)
    {
        return movieRatingService.getAllByUserId(userId);
    }
}

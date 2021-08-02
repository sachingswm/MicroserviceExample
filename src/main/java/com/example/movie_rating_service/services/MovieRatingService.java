package com.example.movie_rating_service.services;

import com.example.movie_rating_service.entities.MovieRating;
import com.example.movie_rating_service.entities.User;
import com.example.movie_rating_service.repositories.MovieRatingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRatingService {
    @Autowired
    private MovieRatingDao movieRatingDao;

    public List<MovieRating> getAllByUserId(Long userId) {
        return movieRatingDao.getAllByUserId(userId);
    }
}

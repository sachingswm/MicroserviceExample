package com.example.movie_rating_service.repositories;

import com.example.movie_rating_service.entities.MovieRating;
import com.example.movie_rating_service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRatingDao extends JpaRepository<MovieRating,Long> {
    @Query(value = "select * from movie_rating where movie_rating.user_user_id=?",nativeQuery = true)
    public List<MovieRating> getAllByUserId(Long userId);
}

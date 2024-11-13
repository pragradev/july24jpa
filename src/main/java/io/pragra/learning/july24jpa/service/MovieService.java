package io.pragra.learning.july24jpa.service;

import io.pragra.learning.july24jpa.entity.Movie;
import io.pragra.learning.july24jpa.entity.MovieEmbdId;
import io.pragra.learning.july24jpa.repo.CastRepo;
import io.pragra.learning.july24jpa.repo.MovieRepo;
import io.pragra.learning.july24jpa.repo.ReviewRepo;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Data
public class MovieService {

    final MovieRepo movieRepo;
    final ReviewRepo reviewRepo;
    final CastRepo castRepo;

    public Movie insertMovie(Movie movie){
        castRepo.saveAll(movie.getCastDetails());
        reviewRepo.save(movie.getReview());
        // insert into database
        return movieRepo.save(movie);
    }

    public List<Movie> getAllMovies(){
        // fetch from database
        List<Movie> movies= movieRepo.findAll();
        return movieRepo.findAll();
    }

    public Optional<Movie> getMovieById(Long id){
        return movieRepo.findById(id);
    }

    public Movie updateMovie(Movie movie){
        Optional<Movie> movieById = getMovieById(movie.getMovieId());
        if(movieById.isPresent()){
            movieRepo.save(movie);
        }

        return movie;
    }

    public List<Movie> saveAll(List<Movie> movies){
        movies.stream().forEach(m -> castRepo.saveAll(m.getCastDetails()));
        reviewRepo.saveAll(movies.stream()
                .map(m -> m.getReview())
                .collect(Collectors.toList()));
        return movieRepo.saveAll(movies);
    }

    @Transactional
    public List<Movie> getMoviesByMovieName(String movieName){
        return movieRepo.getbyname(movieName);
    }


}

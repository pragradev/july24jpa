package io.pragra.learning.july24jpa.service;

import io.pragra.learning.july24jpa.entity.Movie;
import io.pragra.learning.july24jpa.repo.MovieRepo;
import io.pragra.learning.july24jpa.repo.ReviewRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Data
public class MovieService {

    final MovieRepo movieRepo;
    final ReviewRepo reviewRepo;

    public Movie insertMovie(Movie movie){
        reviewRepo.save(movie.getReview());
        // insert into database
        return movieRepo.save(movie);
    }

    public List<Movie> getAllMovies(){
        // fetch from database
        List<Movie> movies= movieRepo.findAll();
        return movieRepo.findAll();
    }

    public Optional<Movie> getMovieById(Integer id){
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
        reviewRepo.saveAll(movies.stream()
                .map(m -> m.getReview())
                .collect(Collectors.toList()));
        return movieRepo.saveAll(movies);
    }


}

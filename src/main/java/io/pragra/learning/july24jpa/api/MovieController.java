package io.pragra.learning.july24jpa.api;

import io.pragra.learning.july24jpa.entity.Movie;
import io.pragra.learning.july24jpa.entity.MovieEmbdId;
import io.pragra.learning.july24jpa.service.MovieService;
import jakarta.servlet.http.PushBuilder;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movie")
@Data
@Slf4j
public class MovieController {

    final MovieService service;
    Logger logger = LoggerFactory.getLogger(MovieController.class);

    @PostMapping()
    public Movie createMovie(@RequestBody Movie movie){
        logger.info(Instant.now() + "Class: MovieController Method: MovieController started execution. Arg: "+ movie);
        return service.insertMovie(movie);
    }

    @GetMapping("/all")
    public List<Movie> movies(){
        return service.getAllMovies();
    }

    @PostMapping("/byid")
    public Optional<Movie> byId(@RequestBody Long identifier){
        return service.getMovieById(identifier);
    }

    @PutMapping
    public Movie update(@RequestBody Movie movie){
        return service.updateMovie(movie);
    }

    @PostMapping("/all")
    public List<Movie> addAll(@RequestBody List<Movie> movies){
        return service.saveAll(movies);
    }

    @GetMapping("/byName")
    public List<Movie> getMovieByName(@RequestParam String movieName){
        return service.getMoviesByMovieName(movieName);
    }
}

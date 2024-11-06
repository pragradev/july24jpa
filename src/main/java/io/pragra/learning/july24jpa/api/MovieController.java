package io.pragra.learning.july24jpa.api;

import io.pragra.learning.july24jpa.entity.Movie;
import io.pragra.learning.july24jpa.service.MovieService;
import jakarta.servlet.http.PushBuilder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movie")
@Data
public class MovieController {

    final MovieService service;

    @PostMapping()
    public Movie createMovie(@RequestBody Movie movie){
        return service.insertMovie(movie);
    }

    @GetMapping("/all")
    public List<Movie> movies(){
        return service.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<Movie> byId(@PathVariable("id") Integer identifier){
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
}

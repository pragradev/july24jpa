package io.pragra.learning.july24jpa.repo;

import io.pragra.learning.july24jpa.entity.Movie;
import io.pragra.learning.july24jpa.entity.MovieEmbdId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {
    //@Query("select m.genre from Movie m where m.movieName=:movieName")
    @Query(nativeQuery = true, value = "select * from CINEMA where MOVIE_NAME=:movieName")
    List<Movie> getbyname(String movieName);

    //List<Movie> findAllByMovieName(String movieName);
}

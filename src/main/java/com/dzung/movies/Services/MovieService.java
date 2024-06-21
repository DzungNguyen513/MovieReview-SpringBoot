package com.dzung.movies.Services;

import com.dzung.movies.Models.Movie;
import com.dzung.movies.Repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService implements IMovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}

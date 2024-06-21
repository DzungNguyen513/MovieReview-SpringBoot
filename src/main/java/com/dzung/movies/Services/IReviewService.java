package com.dzung.movies.Services;

import com.dzung.movies.Models.Review;

public interface IReviewService {
    public Review createReview(String reviewBody, String imdbId);
}

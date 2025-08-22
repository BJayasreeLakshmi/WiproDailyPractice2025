import { Injectable } from '@angular/core';
import { Movie } from './movie.model';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private movies: Movie[] = [];

  constructor() { }

  getMovies(): Movie[] {
    return this.movies;
  }

  addMovie(movie: Movie) {
    this.movies.push(movie);
  }

  updateMovie(updatedMovie: Movie) {
    const index = this.movies.findIndex(m => m.movieId === updatedMovie.movieId);
    if (index !== -1) {
      this.movies[index] = updatedMovie;
    }
  }

  deleteMovie(movieId: number) {
    this.movies = this.movies.filter(m => m.movieId !== movieId);
  }
}

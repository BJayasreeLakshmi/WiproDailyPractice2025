import { Component } from '@angular/core';
import { Movie } from '../movie.model';
import { MovieService } from '../movie.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.html',
  styleUrls: ['./movie.css'],
  imports: [CommonModule, FormsModule]
})
export class MovieComponent {
  movies: Movie[] = [];
  movie: Movie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
  isEdit: boolean = false;

  constructor(private movieService: MovieService) {
    this.loadMovies();
  }

  loadMovies() {
    this.movies = this.movieService.getMovies();
  }

  saveMovie() {
    if (this.isEdit) {
      this.movieService.updateMovie(this.movie);
      this.isEdit = false;
    } else {
      this.movieService.addMovie({ ...this.movie, movieId: Date.now() });
    }
    this.movie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
    this.loadMovies();
  }

  editMovie(movie: Movie) {
    this.movie = { ...movie };
    this.isEdit = true;
  }

  deleteMovie(movieId: number) {
    this.movieService.deleteMovie(movieId);
    this.loadMovies();
  }
}

package Iterator;

import java.util.List;
import java.util.ArrayList;

// Коллекция фильмов на основе списка List
class ListMovieCollection {
    private List<String> movies = new ArrayList<>(); // Список фильмов

    public void addMovie(String movie) {
        // Добавляем фильм в список
        movies.add(movie);
    }

    public Iterator<String> createIterator() {
        // Создаем итератор для списка фильмов
        return new MovieListIterator(movies);
    }
}

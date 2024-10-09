package Iterator;

import java.util.List;

// Итератор для коллекции фильмов на основе списка List
class MovieListIterator implements Iterator<String> {
    private List<String> movies; // Список фильмов
    private int position = 0;    // Текущая позиция в списке

    public MovieListIterator(List<String> movies) {
        this.movies = movies; // Передаем список фильмов в итератор
    }

    @Override
    public boolean hasNext() {
        // Проверяем, есть ли еще фильмы в списке
        return position < movies.size();
    }

    @Override
    public String next() {
        // Возвращаем следующий фильм и увеличиваем позицию
        return movies.get(position++);
    }
}

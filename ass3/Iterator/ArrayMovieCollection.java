package Iterator;

// Коллекция фильмов на основе массива
class ArrayMovieCollection {
    private String[] movies; // Массив фильмов
    private int index = 0;   // Текущая позиция для добавления фильма

    public ArrayMovieCollection(int size) {
        movies = new String[size]; // Инициализируем массив определенного размера
    }

    public void addMovie(String movie) {
        // Добавляем фильм в массив
        if (index < movies.length) {
            movies[index++] = movie;
        }
    }

    public Iterator<String> createIterator() {
        // Создаем итератор для массива фильмов
        return new MovieArrayIterator(movies);
    }
}

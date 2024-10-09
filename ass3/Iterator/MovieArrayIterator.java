package Iterator;

// Итератор для коллекции фильмов на основе массива
class MovieArrayIterator implements Iterator<String> {
    private String[] movies; // Массив фильмов
    private int position = 0; // Текущая позиция в массиве

    public MovieArrayIterator(String[] movies) {
        this.movies = movies; // Передаем массив фильмов в итератор
    }

    @Override
    public boolean hasNext() {
        // Проверяем, есть ли еще фильмы в массиве
        return position < movies.length;
    }

    @Override
    public String next() {
        // Возвращаем следующий фильм и увеличиваем позицию
        return movies[position++];
    }
}

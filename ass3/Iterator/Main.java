package Iterator;

// Главный класс для работы с коллекциями фильмов и их итераторами
public class Main {
    public static void main(String[] args) {
        // Создаем коллекцию фильмов на основе списка List
        ListMovieCollection listMovies = new ListMovieCollection();
        listMovies.addMovie("Фильм 1");
        listMovies.addMovie("Фильм 2");
        listMovies.addMovie("Фильм 3");

        // Создаем коллекцию фильмов на основе массива Array
        ArrayMovieCollection arrayMovies = new ArrayMovieCollection(3);
        arrayMovies.addMovie("Фильм A");
        arrayMovies.addMovie("Фильм B");
        arrayMovies.addMovie("Фильм C");

        // Проходим по фильмам из списка
        Iterator<String> listIterator = listMovies.createIterator();
        System.out.println("Фильмы из списка:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Проходим по фильмам из массива
        Iterator<String> arrayIterator = arrayMovies.createIterator();
        System.out.println("\nФильмы из массива:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}

import javafx.application.Application;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    // Главный метод, который запускает JavaFX приложение
    @Override
    public void start(Stage primaryStage) {
        // Создаем объект модели, который будет выполнять вычисления
        CalculatorModel model = new CalculatorModel();

        // Создаем объект представления (интерфейс пользователя)
        CalculatorView view = new CalculatorView();

        // Создаем контроллер, который связывает модель и представление
        // Контроллер будет обрабатывать события от пользователя и обновлять интерфейс
        new CalculatorController(model, view);

        // Запускаем интерфейс калькулятора
        view.start(primaryStage);
    }

    // Главный метод для запуска приложения
    public static void main(String[] args) {
        // Метод launch запускает JavaFX приложение
        launch(args);
    }
}

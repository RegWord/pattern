import javafx.scene.Scene;
import javafx.scene.control.*; // Импортируем все необходимые компоненты для интерфейса
import javafx.scene.layout.*; // Импортируем менеджеры компоновки
import javafx.stage.Stage;
import javafx.geometry.*; // Для задания выравнивания
import javafx.scene.paint.Color; // Для изменения цвета элементов
import javafx.scene.text.Font; // Для изменения шрифта

public class CalculatorView {
    // Поля для ввода первого и второго числа
    private TextField firstNumber = new TextField();
    private TextField secondNumber = new TextField();
    // Метка для отображения результата
    private Label resultLabel = new Label();
    // Кнопки для выполнения арифметических операций
    private Button addButton = new Button("+");
    private Button subtractButton = new Button("-");
    private Button multiplyButton = new Button("*");
    private Button divideButton = new Button("/");

    // Метод для инициализации и отображения окна приложения
    public void start(Stage primaryStage) {
        // Создаем GridPane для размещения элементов интерфейса
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10)); // Внутренние отступы
        gridPane.setHgap(10); // Горизонтальный зазор между элементами
        gridPane.setVgap(10); // Вертикальный зазор между элементами

        // Устанавливаем фон для интерфейса (в стиле iOS)
        gridPane.setStyle("-fx-background-color: #151515;");

        // Настраиваем стили для полей ввода
        firstNumber.setFont(Font.font(18)); // Увеличиваем шрифт для удобства
        firstNumber.setStyle("-fx-background-color: #353535; -fx-text-fill: #ffffff;"); // Задаем цвет фона и текста
        secondNumber.setFont(Font.font(18));
        secondNumber.setStyle("-fx-background-color: #353535; -fx-text-fill: #f8f6f6;");

        // Настраиваем метку для результата
        resultLabel.setFont(Font.font(24)); // Увеличенный шрифт для результата
        resultLabel.setTextFill(Color.WHITE); // Цвет текста

        // Настраиваем стиль кнопок для операций
        styleButton(addButton, "#FF9500", "#FFFFFF"); // Кнопка сложения
        styleButton(subtractButton, "#FF9500", "#FFFFFF"); // Кнопка вычитания
        styleButton(multiplyButton, "#FF9500", "#FFFFFF"); // Кнопка умножения
        styleButton(divideButton, "#FF9500", "#FFFFFF"); // Кнопка деления

        // Добавляем элементы интерфейса на GridPane
        gridPane.add(new Label("Первое число:"), 0, 0); // Метка для первого числа
        gridPane.add(firstNumber, 1, 0); // Поле ввода первого числа

        gridPane.add(new Label("Второе число:"), 0, 1); // Метка для второго числа
        gridPane.add(secondNumber, 1, 1); // Поле ввода второго числа

        // Создаем контейнер для кнопок и размещаем их
        HBox buttons = new HBox(10, addButton, subtractButton, multiplyButton, divideButton);
        buttons.setAlignment(Pos.CENTER); // Выравнивание кнопок по центру
        gridPane.add(buttons, 0, 2, 2, 1); // Добавляем кнопки в GridPane

        // Добавляем метку для отображения результата
        gridPane.add(resultLabel, 0, 3, 2, 1);

        // Создаем сцену и задаем ее для Stage
        Scene scene = new Scene(gridPane, 300, 200); // Создаем сцену размером 300x200
        primaryStage.setScene(scene); // Устанавливаем сцену в Stage
        primaryStage.setTitle("Калькулятор"); // Задаем заголовок окна
        primaryStage.show(); // Отображаем окно приложения
    }

    // Метод для получения первого числа из текстового поля
    public double getFirstNumber() throws NumberFormatException {
        return Double.parseDouble(firstNumber.getText()); // Преобразуем текст в число
    }

    // Метод для получения второго числа из текстового поля
    public double getSecondNumber() throws NumberFormatException {
        return Double.parseDouble(secondNumber.getText());
    }

    // Метод для установки результата в метку
    public void setResult(String result) {
        resultLabel.setText(result); // Отображаем результат на экране
    }

    // Методы для получения кнопок (для контроллера)
    public Button getAddButton() {
        return addButton;
    }

    public Button getSubtractButton() {
        return subtractButton;
    }

    public Button getMultiplyButton() {
        return multiplyButton;
    }

    public Button getDivideButton() {
        return divideButton;
    }

    // Метод для настройки стиля кнопок (цвета и размеров)
    private void styleButton(Button button, String backgroundColor, String textColor) {
        button.setFont(Font.font(18)); // Устанавливаем шрифт кнопки
        button.setStyle("-fx-background-color: " + backgroundColor + "; -fx-text-fill: " + textColor + ";"); // Задаем цвет фона и текста
        button.setPrefWidth(50); // Задаем ширину кнопки
        button.setPrefHeight(50); // Задаем высоту кнопки
    }

    // Метод для добавления обработчиков событий для кнопок (регистрация контроллера)
    public void addOperationListener(CalculatorController controller) {
        addButton.setOnAction(controller); // Добавляем контроллер для кнопки сложения
        subtractButton.setOnAction(controller); // Добавляем контроллер для кнопки вычитания
        multiplyButton.setOnAction(controller); // Добавляем контроллер для кнопки умножения
        divideButton.setOnAction(controller); // Добавляем контроллер для кнопки деления
    }
}

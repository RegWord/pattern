import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CalculatorController implements EventHandler<ActionEvent> {
    // Модель - здесь находятся все вычисления
    private CalculatorModel model;
    // Представление - интерфейс, через который пользователь взаимодействует с приложением
    private CalculatorView view;

    // Конструктор, который связывает модель и представление, а также регистрирует обработчики для кнопок
    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model; // Присваиваем переданную модель
        this.view = view;   // Присваиваем переданное представление
        // Подключаем контроллер к кнопкам представления
        view.addOperationListener(this);
    }

    // Метод, который обрабатывает нажатия кнопок (+, -, *, /)
    @Override
    public void handle(ActionEvent event) {
        try {
            // Получаем числа, которые ввел пользователь
            double num1 = view.getFirstNumber();
            double num2 = view.getSecondNumber();
            String result = "";

            // Проверяем, какая кнопка была нажата, и выполняем соответствующую операцию
            if (event.getSource() == view.getAddButton()) {
                result = String.valueOf(model.add(num1, num2)); // Сложение
            } else if (event.getSource() == view.getSubtractButton()) {
                result = String.valueOf(model.subtract(num1, num2)); // Вычитание
            } else if (event.getSource() == view.getMultiplyButton()) {
                result = String.valueOf(model.multiply(num1, num2)); // Умножение
            } else if (event.getSource() == view.getDivideButton()) {
                result = String.valueOf(model.divide(num1, num2)); // Деление
            }

            // Отправляем результат вычисления обратно в представление
            view.setResult(result);

        } catch (NumberFormatException e) {
            // Если введены некорректные данные (например, текст вместо чисел), показываем ошибку
            view.setResult("Ошибка: некорректный ввод");
        } catch (ArithmeticException e) {
            // Если произошла арифметическая ошибка (например, деление на ноль), выводим сообщение об ошибке
            view.setResult(e.getMessage());
        }
    }
}

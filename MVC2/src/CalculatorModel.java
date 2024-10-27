public class CalculatorModel {

    // Метод для сложения двух чисел
    public double add(double a, double b) {
        return a + b; // Возвращаем сумму двух чисел
    }

    // Метод для вычитания второго числа из первого
    public double subtract(double a, double b) {
        return a - b; // Возвращаем разность двух чисел
    }

    // Метод для умножения двух чисел
    public double multiply(double a, double b) {
        return a * b; // Возвращаем произведение двух чисел
    }

    // Метод для деления первого числа на второе
    public double divide(double a, double b) throws ArithmeticException {
        // Проверяем, не пытается ли пользователь делить на ноль
        if (b == 0) {
            throw new ArithmeticException("Ошибка: деление на ноль"); // Генерируем ошибку при делении на ноль
        }
        return a / b; // Возвращаем результат деления
    }
}

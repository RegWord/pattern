package Chain;

// Короче, это базовый класс для всех обработчиков платежей
abstract class PaymentHandler {
    protected PaymentHandler next;

    // Это для того, чтобы установить следующий обработчик
    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    // Метод, который будет пытаться провести платеж, если можно
    public abstract boolean handle(int amount);
}


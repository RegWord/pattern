package Chain;

// Обработчик для способа B
class PayByB extends PaymentHandler {
    private int balanceB = 300; // Тут бабла побольше

    public boolean handle(int amount) {
        if (balanceB >= amount) {
            System.out.println("Оплата прошла через способ B.");
            return true;
        } else if (next != null) {
            // Если тут не хватило, передаем дальше по цепочке
            return next.handle(amount);
        }
        return false;
    }
}

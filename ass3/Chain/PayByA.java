package Chain;

// Этот обработчик отвечает за оплату через способ A
class PayByA extends PaymentHandler {
    private int balanceA = 100; // Это баланс способа A, если чё

    public boolean handle(int amount) {
        if (balanceA >= amount) {
            System.out.println("Оплата прошла через способ A.");
            return true;
        } else if (next != null) {
            // Если не хватило бабла, передаем дальше
            return next.handle(amount);
        }
        return false;
    }
}

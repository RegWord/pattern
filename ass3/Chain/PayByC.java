package Chain;

// Последний обработчик для способа C
class PayByC extends PaymentHandler {
    private int balanceC = 1000; // Ну тут уж точно хватит

    public boolean handle(int amount) {
        if (balanceC >= amount) {
            System.out.println("Оплата прошла через способ C.");
            return true;
        }
        // Если даже тут не хватило, то всё, беда
        return false;
    }
}

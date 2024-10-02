class CoffeeBazaar {
    private static CoffeeBazaar oneAndOnly;

    private CoffeeBazaar() {
        System.out.println("Добро пожаловать в наш Кофе-Базар!");
    }

    public static CoffeeBazaar getBazaarInstance() {
        if (oneAndOnly == null) {
            oneAndOnly = new CoffeeBazaar();
        }
        return oneAndOnly;
    }

    public void takeMyMoney(MysteryBeverage beverage) {
        System.out.println("Ваш заказ на: " + beverage.getExoticDescription());
    }
}

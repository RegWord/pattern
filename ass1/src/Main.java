public class Main {
    public static void main(String[] args) {
        // Singleton
        CoffeeBazaar coffeeBazaar = CoffeeBazaar.getBazaarInstance();

        // Factory Method
        PotionCraftingStation dragonBreathStation = new DragonBreathEspressoStation();
        MysteryBeverage dragonBreathEspresso = dragonBreathStation.brewPotion();
        coffeeBazaar.takeMyMoney(dragonBreathEspresso);

        PotionCraftingStation unicornMilkStation = new UnicornMilkLatteStation();
        MysteryBeverage unicornMilkLatte = unicornMilkStation.brewPotion();
        coffeeBazaar.takeMyMoney(unicornMilkLatte);

        // Abstract Factory
        EnchantedIngredientFactory basicPotionIngredients = new BasicPotionIngredientFactory();
        EnchantedIngredientFactory veganPotionIngredients = new VeganMagicIngredientFactory();

        BeverageOrder order1 = new BeverageOrder(dragonBreathEspresso, basicPotionIngredients);
        order1.describePotion();

        BeverageOrder order2 = new BeverageOrder(unicornMilkLatte, veganPotionIngredients);
        order2.describePotion();

        // Prototype
        BeverageOrder clonedOrder = order1.clone();
        clonedOrder.describePotion();

        // Builder
        CustomPotionBuilder builder = new CustomPotionBuilder(unicornMilkLatte);
        CustomPotion customUnicornLatte = builder.addMagicMilk("Козье молоко из сказочного леса")
                .addMysticalSyrup("Сироп лунных ягод")
                .addEnchantedToppings("Звездная пыль")
                .createPotion();
        customUnicornLatte.unveilPotion();
    }
}

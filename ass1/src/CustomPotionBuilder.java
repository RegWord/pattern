class CustomPotionBuilder {
    private MysteryBeverage mysticalPotion;
    private String magicalMilk = "Нет молока";
    private String mysticalSyrup = "Нет сиропа";
    private String enchantedToppings = "Нет топпинга";

    public CustomPotionBuilder(MysteryBeverage mysticalPotion) {
        this.mysticalPotion = mysticalPotion;
    }

    public CustomPotionBuilder addMagicMilk(String magicalMilk) {
        this.magicalMilk = magicalMilk;
        return this;
    }

    public CustomPotionBuilder addMysticalSyrup(String mysticalSyrup) {
        this.mysticalSyrup = mysticalSyrup;
        return this;
    }

    public CustomPotionBuilder addEnchantedToppings(String enchantedToppings) {
        this.enchantedToppings = enchantedToppings;
        return this;
    }

    public CustomPotion createPotion() {
        return new CustomPotion(mysticalPotion, magicalMilk, mysticalSyrup, enchantedToppings);
    }
}

class CustomPotion {
    private MysteryBeverage mysticalPotion;
    private String magicalMilk;
    private String mysticalSyrup;
    private String enchantedToppings;

    public CustomPotion(MysteryBeverage mysticalPotion, String magicalMilk, String mysticalSyrup, String enchantedToppings) {
        this.mysticalPotion = mysticalPotion;
        this.magicalMilk = magicalMilk;
        this.mysticalSyrup = mysticalSyrup;
        this.enchantedToppings = enchantedToppings;
    }

    public void unveilPotion() {
        System.out.println("Кастомное зелье: " + mysticalPotion.getExoticDescription() +
                ", молоко: " + magicalMilk +
                ", сироп: " + mysticalSyrup +
                ", топпинг: " + enchantedToppings);
    }
}

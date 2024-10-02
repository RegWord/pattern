interface EnchantedIngredientFactory {
    String summonMilk();
    String invokeSyrup();
    String castToppings();
}

class BasicPotionIngredientFactory implements EnchantedIngredientFactory {
    public String summonMilk() {
        return "Коровье молоко с фермы волшебников";
    }

    public String invokeSyrup() {
        return "Сироп с волшебными нотками карамели";
    }

    public String castToppings() {
        return "Мелко нарезанные чары шоколада";
    }
}

class VeganMagicIngredientFactory implements EnchantedIngredientFactory {
    public String summonMilk() {
        return "Овсяное молоко из магической рощи";
    }

    public String invokeSyrup() {
        return "Миндальный сироп из леса фей";
    }

    public String castToppings() {
        return "Стружка кокоса из тропиков духов";
    }
}

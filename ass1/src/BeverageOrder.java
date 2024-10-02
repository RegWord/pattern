class BeverageOrder implements Cloneable {
    private MysteryBeverage mysticalPotion;
    private EnchantedIngredientFactory ingredientConcoction;

    public BeverageOrder(MysteryBeverage mysticalPotion, EnchantedIngredientFactory ingredientConcoction) {
        this.mysticalPotion = mysticalPotion;
        this.ingredientConcoction = ingredientConcoction;
    }

    public BeverageOrder clone() {
        try {
            return (BeverageOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void describePotion() {
        System.out.println("Зелье: " + mysticalPotion.getExoticDescription() +
                ", молоко: " + ingredientConcoction.summonMilk() +
                ", сироп: " + ingredientConcoction.invokeSyrup() +
                ", топпинг: " + ingredientConcoction.castToppings());
    }
}

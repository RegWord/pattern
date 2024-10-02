abstract class PotionCraftingStation {
    public abstract MysteryBeverage brewPotion();
}

class DragonBreathEspressoStation extends PotionCraftingStation {
    public MysteryBeverage brewPotion() {
        return new DragonBreathEspresso();
    }
}

class UnicornMilkLatteStation extends PotionCraftingStation {
    public MysteryBeverage brewPotion() {
        return new UnicornMilkLatte();
    }
}

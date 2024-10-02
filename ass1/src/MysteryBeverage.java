abstract class MysteryBeverage {
    String exoticDescription = "Неизвестное зелье";

    public String getExoticDescription() {
        return exoticDescription;
    }

    public abstract double magicalCost();
}

class DragonBreathEspresso extends MysteryBeverage {
    public DragonBreathEspresso() {
        exoticDescription = "Эспрессо 'Дыхание дракона'";
    }

    public double magicalCost() {
        return 2.0;
    }
}

class UnicornMilkLatte extends MysteryBeverage {
    public UnicornMilkLatte() {
        exoticDescription = "Латте с молоком единорога";
    }

    public double magicalCost() {
        return 3.5;
    }
}

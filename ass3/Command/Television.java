package Command;

// Ну это телевизор. С ним можно всякое делать — включать, выключать, менять каналы и звук
class Television {
    public void turnOn() {
        System.out.println("Телевизор включен.");
    }

    public void turnOff() {
        System.out.println("Телевизор выключен.");
    }

    public void volumeUp() {
        System.out.println("Громкость увеличена.");
    }

    public void volumeDown() {
        System.out.println("Громкость уменьшена.");
    }

    public void nextChannel() {
        System.out.println("Следующий канал.");
    }

    public void previousChannel() {
        System.out.println("Предыдущий канал.");
    }
}

package Mediator;

// Это базовый класс для всех сенсоров
abstract class Sensor {
    protected HomeMediator mediator;

    // Тут мы присваиваем посредника сенсору
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    // Каждый сенсор должен иметь свой тип
    public abstract String getType();

    // Метод для отправки данных, каждый сенсор будет переопределять
    public abstract void sendData();
}

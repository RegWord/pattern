package Mediator;

// Сенсор для измерения влажности
class HumiditySensor extends Sensor {
    public String getType() {
        return "Сенсор влажности"; // Тип сенсора
    }

    public void sendData() {
        // Отправляем данные о влажности через посредника
        mediator.receiveData(this, "55%");
    }
}

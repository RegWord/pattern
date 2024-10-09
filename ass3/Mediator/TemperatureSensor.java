package Mediator;

// Сенсор для измерения температуры
class TemperatureSensor extends Sensor {
    public String getType() {
        return "Сенсор температуры"; // Тип сенсора
    }

    public void sendData() {
        // Отправляем данные о температуре через посредника
        mediator.receiveData(this, "22°C");
    }
}

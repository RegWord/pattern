package Mediator;

// Сенсор для измерения уровня освещенности
class LightSensor extends Sensor {
    public String getType() {
        return "Сенсор освещенности"; // Тип сенсора
    }

    public void sendData() {
        // Отправляем данные о свете через посредника
        mediator.receiveData(this, "300 люмен");
    }
}

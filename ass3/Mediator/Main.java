package Mediator;

// Главный класс для запуска всей системы сенсоров
public class Main {
    public static void main(String[] args) {
        HomeMediatorImpl mediator = new HomeMediatorImpl();

        // Создаем три сенсора: температуры, влажности и освещенности
        Sensor tempSensor = new TemperatureSensor();
        Sensor humiditySensor = new HumiditySensor();
        Sensor lightSensor = new LightSensor();

        // Регистрируем сенсоры у посредника
        mediator.registerSensor(tempSensor);
        mediator.registerSensor(humiditySensor);
        mediator.registerSensor(lightSensor);

        // Все сенсоры отправляют данные
        tempSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Выводим отчёт от посредника
        mediator.report();
    }
}

package Mediator;

// Интерфейс посредника для управления взаимодействием между сенсорами
interface HomeMediator {
    void registerSensor(Sensor sensor); // Метод для регистрации сенсоров
    void receiveData(Sensor sensor, String data); // Метод для получения данных от сенсора
    void report(); // Отчет по всем сенсорам
}

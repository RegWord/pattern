package Mediator;

import java.util.List;
import java.util.ArrayList;

// Реализация посредника, который управляет сенсорами
class HomeMediatorImpl implements HomeMediator {
    private List<Sensor> sensors = new ArrayList<>(); // Список всех сенсоров
    private List<String> dataLog = new ArrayList<>(); // Лог для хранения данных от сенсоров

    // Метод для регистрации сенсоров
    public void registerSensor(Sensor sensor) {
        sensor.setMediator(this); // Устанавливаем посредника для сенсора
        sensors.add(sensor); // Добавляем сенсор в список
    }

    // Получаем данные от сенсора
    public void receiveData(Sensor sensor, String data) {
        String logEntry = sensor.getType() + ": " + data; // Формируем запись в логе
        dataLog.add(logEntry); // Сохраняем данные
    }

    // Выводим отчет по собранным данным
    public void report() {
        System.out.println("Отчёт с сенсоров:");
        for (String entry : dataLog) {
            System.out.println(entry);
        }
    }
}

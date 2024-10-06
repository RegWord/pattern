package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Прокси для "ленивой" загрузки документа
public class ProxyDocument implements Document {
    // Реальный документ, который будет загружен только при необходимости
    private RealDocument realDocument;
    // Заголовок документа
    private String title;

    // Конструктор прокси, который принимает только заголовок документа
    public ProxyDocument(String title) {
        this.title = title;
    }

    // Логика создания реального документа только при первом вызове display()
    @Override
    public void display() {
        // Проверяем, создан ли уже реальный документ
        if (realDocument == null) {
            // Если не создан, создаем RealDocument, когда он впервые нужен
            realDocument = new RealDocument(title);
        }
        // Передаем вызов метода display() реальному документу
        realDocument.display();
    }

    // Метод open() пока не реализован
    @Override
    public void open() {
        // Может быть реализован при необходимости
    }
}

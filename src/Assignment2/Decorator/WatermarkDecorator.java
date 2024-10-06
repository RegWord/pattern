package Assignment2.Decorator;

import Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {

    // Конструктор, который принимает документ, к которому будет добавлен водяной знак
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);  // Вызываем конструктор родительского класса
    }

    // Задание: Реализовать логику, которая сначала отображает документ, а затем добавляет водяной знак
    @Override
    public void display() {
        // Сначала отображаем оригинальный документ
        decoratedDocument.display();

        // Затем добавляем водяной знак
        addWatermark();
    }

    // Метод открытия документа, пока не реализован
    @Override
    public void open() {
        // Может быть реализован в будущем
    }

    // Метод для добавления водяного знака к документу
    private void addWatermark() {
        System.out.println("Добавляем водяной знак на документ.");
        // Здесь можно добавить код, который реально вставляет водяной знак в документ,
        // например, графический или текстовый элемент.
    }
}

package Assignment2.Composite;

import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс для управления группами документов (категориями)
public class DocumentGroup implements Document {
    // Список документов, которые находятся в этой группе
    private List<Document> documents = new ArrayList<>();

    // Задание: Реализовать методы для добавления и удаления документов из группы,
    // а также для отображения всех документов в группе с помощью метода display().

    // Добавление документа в группу
    public void addDocument(Document document) {
        documents.add(document);  // Добавляем документ в список
    }

    // Удаление документа из группы
    public void removeDocument(Document document) {
        documents.remove(document);  // Удаляем документ из списка
    }

    // Отображение всех документов в группе
    @Override
    public void display() {
        // Проходим по каждому документу в списке и отображаем его
        for (Document doc : documents) {
            doc.display();  // Вызываем метод display для каждого документа в группе
        }
    }

    // Метод открытия группы документов, но пока он не реализован
    @Override
    public void open() {
        // Этот метод может быть реализован позже, если понадобится
    }
}

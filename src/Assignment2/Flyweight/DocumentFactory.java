package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.RealDocument;

import java.util.HashMap; // Импортируем HashMap для хранения документов
import java.util.Map; // Импортируем интерфейс Map

// Фабрика для создания и повторного использования документов
public class DocumentFactory {
    // Статическая карта для хранения документов, где ключом является заголовок документа
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Метод для получения документа по его заголовку
    public static Document getDocumentByTitle(String title) {
        // Проверяем, существует ли документ с таким заголовком в карте
        Document document = documentMap.get(title);

        // Если документа нет в карте, создаем новый
        if (document == null) {
            document = createDocument(title);  // Создаем новый документ
            documentMap.put(title, document);  // Сохраняем созданный документ в карту
        }

        // Возвращаем найденный или вновь созданный документ
        return document;
    }

    // Вспомогательный метод для создания нового документа
    private static Document createDocument(String title) {
        // Для простоты предполагаем, что все документы одного типа (например, RealDocument)
        return new RealDocument(title);  // Убедимся, что RealDocument реализует интерфейс Document
    }
}

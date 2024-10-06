package Assignment2.Facade;

import Assignment2.Bridge.DocumentRenderer;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;

// Фасад для упрощения работы с документами и различными функциями рендеринга
public class DocumentFacade {

    // Метод для отображения документа
    public void displayDocument(String title) {
        // Получаем документ по заголовку с помощью фабрики документов
        Document document = DocumentFactory.getDocumentByTitle(title);

        // Если документ найден, отображаем его
        if (document != null) {
            document.display();
        } else {
            // Если документ не найден, выводим сообщение
            System.out.println("Document not found.");
        }
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String title) {
        // Получаем документ по заголовку с помощью фабрики документов
        Document document = DocumentFactory.getDocumentByTitle(title);

        // Если документ найден, создаем его декорированную версию с водяным знаком
        if (document != null) {
            Document watermarkedDocument = new WatermarkDecorator(document);
            watermarkedDocument.display();  // Отображаем документ с водяным знаком
        } else {
            // Если документ не найден, выводим сообщение
            System.out.println("Document not found.");
        }
    }

    // Метод для рендеринга документа с использованием заданного движка рендеринга
    public void renderDocument(String title, RenderEngine engine) {
        // Получаем документ по заголовку с помощью фабрики документов
        Document document = DocumentFactory.getDocumentByTitle(title);

        // Если документ найден, используем движок рендеринга
        if (document != null) {
            // Создаем новый рендерер документа, используя движок
            DocumentRenderer renderer = new DocumentRenderer(engine) {
                @Override
                public void render(String content) {
                    // Реализуем логику рендеринга, используя движок
                    System.out.println("Rendering with engine: " + content);
                }

                @Override
                public void renderDocument(String content) {
                    // Этот метод можно реализовать позже, если потребуется
                }
            };

            // Вызываем рендеринг, передавая содержимое документа
            renderer.render(document.toString());  // toString предполагается как содержимое документа
        } else {
            // Если документ не найден, выводим сообщение
            System.out.println("Document not found.");
        }
    }
}

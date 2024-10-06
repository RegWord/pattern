package Assignment2;

import Assignment2.Facade.DocumentFacade;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Adapter.PDFDocumentAdapter;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Bridge.HighlightRenderEngine;
import Assignment2.Flyweight.DocumentFactory;

public class Main {
    public static void main(String[] args) {

        // Создаем объект фасада для упрощенного взаимодействия с документами
        DocumentFacade facade = new DocumentFacade();

        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        // Ленивая загрузка документа "Report". Реальный документ создается только при первом вызове display().
        facade.displayDocument("Report");

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        // Декорируем документ "Report" водяным знаком перед его отображением
        facade.displayDocumentWithWatermark("Report");

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        // Документ "Report" уже должен быть создан фабрикой и повторно используется без создания нового экземпляра
        facade.displayDocument("Report");

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        // Создаем группу документов и добавляем в нее несколько документов
        DocumentGroup group = new DocumentGroup();
        group.addDocument(DocumentFactory.getDocumentByTitle("Report"));  // Добавляем документ "Report" в группу
        group.addDocument(DocumentFactory.getDocumentByTitle("Presentation"));  // Добавляем документ "Presentation" в группу
        group.display();  // Отображаем все документы в группе

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        // Создаем адаптер для работы с PDF документом "document.pdf"
        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
        pdfDocument.display();  // Отображаем PDF документ через адаптер

        // 6. Использование Bridge для рендеринга
        System.out.println("\n6. Рендеринг документа через движок:");
        // Рендерим документ "Report" с использованием простого рендер-движка
        RenderEngine simpleEngine = new SimpleRenderEngine();
        facade.renderDocument("Report", simpleEngine);  // Используем SimpleRenderEngine для рендеринга

        // Рендерим тот же документ с использованием HighlightRenderEngine для подсветки
        RenderEngine highlightEngine = new HighlightRenderEngine();
        facade.renderDocument("Report", highlightEngine);  // Используем HighlightRenderEngine для рендеринга с подсветкой
    }
}

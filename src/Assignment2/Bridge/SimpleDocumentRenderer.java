package Assignment2.Bridge;

// Реализация рендеринга документа с использованием выбранного движка
public class SimpleDocumentRenderer extends DocumentRenderer {

    // Конструктор, который вызывает конструктор родительского класса и передает ему движок
    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    // Метод для рендеринга содержимого, но пока пустой
    @Override
    public void render(String content) {
        // Этот метод может быть реализован в будущем, если понадобится
    }

    // Задание: реализовать рендеринг документа с использованием переданного движка
    @Override
    public void renderDocument(String content) {
        // Здесь вызывается метод рендеринга у движка (может быть SimpleRenderEngine или HighlightRenderEngine)
        engine.render(content);
        // Этот метод отвечает за отображение контента на экране через выбранный движок
    }
}

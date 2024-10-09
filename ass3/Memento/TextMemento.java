package Memento;

// Класс для хранения снимка состояния текста
class TextMemento {
    private final String textState; // Состояние текста на момент создания снимка

    public TextMemento(String textState) {
        this.textState = textState; // Сохраняем текущее состояние текста
    }

    public String getTextState() {
        return textState; // Возвращаем сохранённое состояние текста
    }
}

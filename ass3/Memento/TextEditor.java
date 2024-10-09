package Memento;

// Класс текстового редактора, который может сохранять и восстанавливать текст
class TextEditor {
    private StringBuilder text; // Текущий текст редактора

    public TextEditor() {
        text = new StringBuilder(); // Инициализируем пустой текст
    }

    // Добавляем текст в редактор
    public void addText(String newText) {
        text.append(newText).append("\n"); // Добавляем новый текст с новой строки
    }

    // Создаем снимок состояния
    public TextMemento save() {
        return new TextMemento(text.toString()); // Возвращаем новый снимок с текущим текстом
    }

    // Восстанавливаем состояние текста из снимка
    public void restore(TextMemento memento) {
        text = new StringBuilder(memento.getTextState()); // Восстанавливаем текст из снимка
    }

    // Возвращаем текущий текст для отображения
    public String getText() {
        return text.toString(); // Возвращаем текущий текст редактора
    }
}

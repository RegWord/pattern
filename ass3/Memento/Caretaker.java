package Memento;

import java.util.Stack;

// Класс Caretaker для управления снимками редактора
class Caretaker {
    private Stack<TextMemento> mementoStack = new Stack<>(); // Стек для хранения снимков

    // Сохраняем снимок
    public void save(TextEditor editor) {
        mementoStack.push(editor.save()); // Сохраняем снимок состояния текста
    }

    // Восстанавливаем снимок
    public void undo(TextEditor editor) {
        if (!mementoStack.isEmpty()) {
            editor.restore(mementoStack.pop()); // Восстанавливаем последнее сохраненное состояние
        } else {
            System.out.println("Нет сохраненных состояний для восстановления."); // Если снимков нет
        }
    }
}

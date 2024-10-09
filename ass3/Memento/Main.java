package Memento;

// Главный класс для тестирования паттерна Memento
public class Main {
    public static void main(String[] args) {
        // Создаем текстовый редактор и хранителя состояний
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Добавляем текст в редактор
        editor.addText("Первая строка текста.");
        caretaker.save(editor); // Сохраняем текущее состояние

        // Добавляем ещё текст
        editor.addText("Вторая строка текста.");
        caretaker.save(editor); // Сохраняем текущее состояние

        // Добавляем ещё текст
        editor.addText("Третья строка текста.");
        System.out.println("Текущий текст:\n" + editor.getText());

        // Отменяем последнее добавление текста
        caretaker.undo(editor);
        System.out.println("\nТекст после одного undo:\n" + editor.getText());

        // Отменяем ещё раз
        caretaker.undo(editor);
        System.out.println("\nТекст после второго undo:\n" + editor.getText());
    }
}

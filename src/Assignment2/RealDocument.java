package Assignment2;

// Реальный документ, который требует загрузки
public class RealDocument implements Document {
    // Заголовок документа
    private String title;

    // Конструктор, который принимает заголовок документа
    public RealDocument(String title) {
        this.title = title;
        loadFromDisk(); // Загружаем документ при его создании
    }

    // Метод для загрузки документа с диска
    private void loadFromDisk() {
        // Выводим сообщение о загрузке документа
        System.out.println("Loading document: " + title);
        // Здесь может быть добавлен код для фактической загрузки документа из файла или другого источника
    }

    @Override
    public void display() {
        // Выводим сообщение о том, что документ отображается
        System.out.println("Displaying document: " + title);
        // Здесь может быть добавлен код для фактического отображения документа, например, в графическом интерфейсе
    }

    @Override
    public void open() {
        // Метод open() пока не реализован, можно добавить логику для открытия документа
    }
}

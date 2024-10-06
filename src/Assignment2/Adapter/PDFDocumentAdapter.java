package Assignment2.Adapter;

import Assignment2.Document;

// Класс-адаптер, чтобы можно было работать с PDF-документами,
// как с обычными документами в нашей системе. Без адаптера пришлось бы
// вручную переделывать методы, а это было бы неудобно и долго.
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    // Когда мы создаем адаптер, мы передаем в него имя файла PDF, чтобы
    // потом работать с этим конкретным документом.
    // Типа как говорим: "Вот, держи файл и покажи его мне!"
    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    // Этот метод вызывается, чтобы открыть PDF-документ.
    // Мы просто перенаправляем вызов в метод открытия у PDF-документа.
    @Override
    public void open() {
        pdfDocument.openPDF();
    }

    // А этот метод для того, чтобы показать PDF-документ на экране.
    // Опять же, мы вызываем метод PDF-документа для отображения.
    @Override
    public void display() {
        pdfDocument.showPDF();
        // И тут уже PDF-документ будет показан на экране, вау!
    }
}

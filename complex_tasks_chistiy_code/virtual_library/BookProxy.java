package complex_tasks_chistiy_code.virtual_library;

public class BookProxy {
    private Book bookMetadata;
    private Book fullBook;

    public BookProxy(Book bookMetadata) {
        this.bookMetadata = bookMetadata;
    }

    public String getTitle() {
        return bookMetadata.getTitle();
    }

    public String getAuthor() {
        return bookMetadata.getAuthor();
    }

    public String getDescription() {
        return bookMetadata.getDescription();
    }

    public String getContent() {
        if (this.fullBook == null) {
            System.out.println("Loading content from: " + bookMetadata.getFilePath());

            String content = loadContent();

            fullBook = new Book(bookMetadata.getTitle(),
                    bookMetadata.getAuthor(),
                    bookMetadata.getDescription(),
                    bookMetadata.getFilePath(),
                    content);
        }
        return fullBook.getContent();
    }

    public String loadContent() {
        //заглушка скачивания контента книги
        return "Full content of the book";
    }
}

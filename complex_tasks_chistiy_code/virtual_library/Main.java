package complex_tasks_chistiy_code.virtual_library;

public class Main {
    public static void main(String[] args) {
        //Инициализация Bookbuilder для создания книги
        Book book = new Book.BookBuilder().setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setDescription("A historical novel about the Napoleonic Wars.")
                .setFilePath("path/to/example")
                .build();

        // Инициализация proxy для ленивой загрузки
        BookProxy proxy = new BookProxy (book);

        //Доступ к содержимому книги через prоху, загрузка происходит только при первом обращении
        String content = proxy.getContent();
        System.out.println("Content of the book: " + content);
    }
}

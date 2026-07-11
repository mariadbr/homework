package complex_tasks_chistiy_code.virtual_library;

public class Book {
    private String title;
    private String author;
    private String description;

    private String filePath;
    private String content;

    public Book(String title, String author, String description, String filePath, String content) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.filePath = filePath;
        this.content = content;
    }

    public Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.description = builder.description;
        this.filePath = builder.filePath;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getContent() {
        return content;
    }

    static class BookBuilder {
        private String title;
        private String author;
        private String description;
        private String filePath;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}

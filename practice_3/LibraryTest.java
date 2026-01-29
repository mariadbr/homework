package practice_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        System.out.println(myLibrary.author);
        System.out.println(myLibrary.category);
        System.out.println(myLibrary.year);
        System.out.println(myLibrary.getBookTitle()); // к полю bookTitle доступа нет тк у него модификатор дсотупа private
    }
}

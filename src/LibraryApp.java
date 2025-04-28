public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Fyodor", "Dostoevsky");

        Book book1 = new Book("War and Peace", author1, 1869);
        Book book2 = new Book("Crime and Punishment", author2, 1866);

        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);

        // Обновляем год публикации первой книги
        book1.setPublicationYear(1870);
        System.out.println("After updating, Book 1: " + book1);

        // Проверка equals и hashCode
        Book anotherBook = new Book("War and Peace", new Author("Leo", "Tolstoy"), 1870);
        System.out.println("book1.equals(anotherBook)? " + book1.equals(anotherBook));
        System.out.println("book1.hashCode() == anotherBook.hashCode()? " + (book1.hashCode() == anotherBook.hashCode()));
    }
}
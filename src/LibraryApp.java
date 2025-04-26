import java.util.Objects;

public class LibraryApp {

    // Класс Author
    public static class Author {
        private final String firstName;
        private final String lastName;

        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Author author = (Author) o;
            return Objects.equals(firstName, author.firstName) &&
                    Objects.equals(lastName, author.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }
    }

    // Класс Book
    public static class Book {
        private final String title;
        private final Author author;
        private int publicationYear;

        public Book(String title, Author author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        public String getTitle() {
            return title;
        }

        public Author getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        @Override
        public String toString() {
            return "\"" + title + "\" by " + author.toString() + ", published in " + publicationYear;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return publicationYear == book.publicationYear &&
                    Objects.equals(title, book.title) &&
                    Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author, publicationYear);
        }
    }

    // Точка входа в программу
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
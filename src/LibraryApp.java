public class LibraryApp {

    // Класс Author
    public static class Author {
        private String firstName;
        private String lastName;

        // Конструктор для инициализации данных автора
        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Геттеры для получения данных о авторе
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    // Класс Book
    public static class Book {
        private String title;
        private Author author;
        private int publicationYear;

        // Конструктор для инициализации данных книги
        public Book(String title, Author author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        // Геттеры для получения данных о книге
        public String getTitle() {
            return title;
        }

        public Author getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        // Сеттер для изменения года публикации
        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }
    }

    // Точка входа в программу
    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Fyodor", "Dostoevsky");

        // Создаем книги
        Book book1 = new Book("War and Peace", author1, 1869);
        Book book2 = new Book("Crime and Punishment", author2, 1866);

        // Выводим информацию о книгах
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", published in " + book1.getPublicationYear());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", published in " + book2.getPublicationYear());

        // Изменяем год публикации одной из книг
        book1.setPublicationYear(1870);
        System.out.println("After updating, Book 1: " + book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", published in " + book1.getPublicationYear());
    }
}

class Book {
    static String libraryName = "Central Library";

    final String isbn;
    String title, author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("ISBN123", "Java Basics", "John Doe");
        book1.displayDetails();
        Book.displayLibraryName();
    }
}
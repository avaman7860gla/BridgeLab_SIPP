class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Data Structures", "Mark Allen", 299.99);
        lb.display();
        lb.borrowBook();
        lb.display();
        lb.borrowBook();
    }
}

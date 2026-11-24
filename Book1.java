class Book1 {
    int bookId;
    String title;
    String author;

    Book1(int bookId, String title) {
        this(bookId, title, "Unknown Author");
    }

    Book1(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Main {
    public static void main(String[] args) {
        Book1 b1 = new Book1(101, "Java Programming");
        Book1 b2 = new Book1(102, "Python Programming", "James");

        b1.displayBook();
        b2.displayBook();
    }
}
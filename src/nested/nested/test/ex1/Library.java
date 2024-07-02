package nested.nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCount;


    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        // 선 검증로직을 처리
        if (bookCount >= books.length) {
            System.out.println("저장공간 부족");
            return;
        }
        // 선 검증로직을 처리


        // 후 정상로직 처리
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("책 목록");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("title = " + book.title + " author : " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}

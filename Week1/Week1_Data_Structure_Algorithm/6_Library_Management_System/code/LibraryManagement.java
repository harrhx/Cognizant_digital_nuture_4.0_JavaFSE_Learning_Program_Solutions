import java.util.Arrays;
import java.util.Comparator;

class Book {
    String bookId;
    String title;
    String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book[ID=" + bookId + ", Title='" + title + "', Author='" + author + "']";
    }
}

public class LibraryManagement {

    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
                new Book("B003", "1984", "George Orwell"),
                new Book("B004", "Pride and Prejudice", "Jane Austen"),
                new Book("B005", "The Catcher in the Rye", "J.D. Salinger")
        };

        System.out.println("--- Linear Search ---");
        String titleToFindLinear = "1984";
        System.out.println("Searching for '" + titleToFindLinear + "'...");
        Book foundBookLinear = linearSearch(books, titleToFindLinear);
        System.out.println(foundBookLinear != null ? "Found: " + foundBookLinear : "Book not found.");
        System.out.println();

        System.out.println("--- Binary Search ---");
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        System.out.println("Sorted book list for binary search:");
        for(Book book : books) {
            System.out.println("  " + book);
        }
        System.out.println();

        String titleToFindBinary = "The Great Gatsby";
        System.out.println("Searching for '" + titleToFindBinary + "'...");
        Book foundBookBinary = binarySearch(books, titleToFindBinary);
        System.out.println(foundBookBinary != null ? "Found: " + foundBookBinary : "Book not found.");
    }
}

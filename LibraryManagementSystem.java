import java.util.*;

// Book class to store book details
class Book {
    String bookId;
    String title;
    String author;
    String genre;
    String status;

    // Constructor to initialize book details
    public Book(String bookId, String title, String author, String genre, String status) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    // Override toString to display book details
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Status: " + status;
    }
}

public class LibraryManagementSystem {
    private static final Map<String, Book> bookCollection = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    // Main menu for user interaction
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt(); // Takes user's choice
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewAllBooks();
                case 3 -> searchBook();
                case 4 -> updateBook();
                case 5 -> deleteBook();
                case 6 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option! Please try again.");
            }
        }
    }

    // Add a book to the collection
    private static void addBook() {
        System.out.print("Enter Book ID: ");
        String bookId = scanner.nextLine();
        if (bookCollection.containsKey(bookId)) {
            System.out.println("Book ID already exists!");
            return;
        }

        // Ensure title is not empty
        String title;
        do {
            System.out.print("Enter Title: ");
            title = scanner.nextLine().trim();
            if (title.isEmpty()) {
                System.out.println("Title cannot be empty. Please enter a valid title.");
            }
        } while (title.isEmpty());

        // Ensure author is not empty
        String author;
        do {
            System.out.print("Enter Author: ");
            author = scanner.nextLine().trim();
            if (author.isEmpty()) {
                System.out.println("Author cannot be empty. Please enter a valid author.");
            }
        } while (author.isEmpty());

        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        
        // Validate availability status
        System.out.print("Enter Availability (Available/Checked Out): ");
        String status = scanner.nextLine();
        if (!status.equalsIgnoreCase("Available") && !status.equalsIgnoreCase("Checked Out")) {
            System.out.println("Invalid status. Please enter Available or Checked Out.");
            return;
        }

        // Add book to the collection
        Book book = new Book(bookId, title, author, genre, status);
        bookCollection.put(bookId, book);
        System.out.println("Book added successfully!");
    }

    // Display all books
    private static void viewAllBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        bookCollection.values().forEach(System.out::println);
    }

    // Search book by ID or title
    private static void searchBook() {
        System.out.print("Enter Book ID or Title to search: ");
        String query = scanner.nextLine();
        boolean found = false;
        for (Book book : bookCollection.values()) {
            if (book.bookId.equalsIgnoreCase(query) || book.title.equalsIgnoreCase(query)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("Book not found.");
    }

    // Update book details
    private static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        String bookId = scanner.nextLine();
        if (!bookCollection.containsKey(bookId)) {
            System.out.println("Book ID not found.");
            return;
        }
        Book book = bookCollection.get(bookId);
        
        System.out.print("Enter new Title (leave empty to keep current): ");
        String title = scanner.nextLine().trim();
        if (!title.isEmpty()) book.title = title;

        System.out.print("Enter new Author (leave empty to keep current): ");
        String author = scanner.nextLine().trim();
        if (!author.isEmpty()) book.author = author;

        System.out.print("Enter new Genre (leave empty to keep current): ");
        String genre = scanner.nextLine();
        if (!genre.isEmpty()) book.genre = genre;

        System.out.print("Enter new Status (Available/Checked Out): ");
        String status = scanner.nextLine();
        if (!status.isEmpty() && (status.equalsIgnoreCase("Available") || status.equalsIgnoreCase("Checked Out"))) {
            book.status = status;
        }

        System.out.println("Book updated successfully!");
    }

    // Delete a book using Book ID
    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String bookId = scanner.nextLine();
        if (bookCollection.remove(bookId) != null) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Book ID not found.");
        }
    }
}

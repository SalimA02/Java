import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    private List<Book> books;
    private Scanner scanner;

    public LibrarySystem() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
        listBooks();

        if (books.size() % 5 == 0) {
            System.out.print("Do you want to add more books? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                System.out.println("Library operation completed.");
                scanner.close();
                System.exit(0);
            }
        }
    }

    public void listBooks() {
        Integer x = 1;
        System.out.println("List of books in the library:");
        for (Book book : books) {
            System.out.println("");
            System.out.println("Book " + x);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("");

            x++;
        }
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.run();
    }

    public void run() {
        while (true) {
            System.out.print("Enter book title (or type 'exit' to finish): ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter author name: ");
            String authorName = scanner.nextLine();

            System.out.print("Enter author birth date: ");
            String birthDate = scanner.nextLine();

            System.out.print("Enter publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Author author = new Author(authorName, birthDate);
            Book book = new Book(title, author, publicationYear);

            addBook(book);
        }

        System.out.println("Library operation completed.");        
        System.out.println("");

        scanner.close();
    }
}

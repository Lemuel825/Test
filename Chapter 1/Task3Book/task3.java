


import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;


public class task3 {
    // ArrayList to store Book objects
    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        // Instantiate three Book objects with different values and add to the ArrayList
        books.add(new Book("Java Programming", "John Smith", 2021, 39.99));
        books.add(new Book("Python Basics", "Jane Doe", 2020, 29.99));
        books.add(new Book("C++ Essentials", "Michael Johnson", 2019, 49.99));

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Display the menu options
            System.out.println("Select an option:");
            System.out.println("[1] Input new book");
            System.out.println("[2] Display specific book");
            System.out.println("[3] Display all books");
            System.out.println("[4] Display books priced above a certain amount");
            System.out.println("[5] Exit");
            int choice = scanner.nextInt();
    

            switch (choice) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    displaySpecificBook();
                    break;
                case 3:
                    displayAllBooks();
                    break;
                case 4:
                    System.out.print("Enter the minimum price: ");
                    double minPrice = scanner.nextDouble();
                    filterBooks(book -> book.getPrice() > minPrice);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
    
            }
        }
    }

    // Method to add a new book
    public static void addNewBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();

        System.out.print("Enter the year published: ");
        int yearPublished = scanner.nextInt();

        System.out.print("Enter the price of the book: ");
        double price = scanner.nextDouble();

        books.add(new Book(title, author, yearPublished, price));
        System.out.println("New book added successfully!");
    }

    // Method to display a specific book
    public static void displaySpecificBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the book to display (1 to " + books.size() + "): ");
        int index = scanner.nextInt();

        if (index > 0 && index <= books.size()) {
            System.out.println("Book " + index + ":");
            books.get(index - 1).printDetails();
            System.out.println();
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    // Method to display all books using lambda syntax
    public static void displayAllBooks() {
        books.forEach(book -> {
            System.out.println("Book " + (books.indexOf(book) + 1) + ":");
            book.printDetails();
            System.out.println();
        });
    }

    // Method to filter books using a predicate
    public static void filterBooks(Predicate<Book> condition) {
        books.stream()
             .filter(condition)
             .forEach(Book::printDetails);
    }
}


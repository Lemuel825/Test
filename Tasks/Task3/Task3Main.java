package Tasks.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3Main {

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

}

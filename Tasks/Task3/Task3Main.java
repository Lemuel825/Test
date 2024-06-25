package Tasks.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3Main {

        private ArrayList<Book> bookList = new ArrayList<>();
        static Task3Main MainObj = new Task3Main();
    public static void main(String[] args) {
         // Instantiate three Book objects with different values and add to the ArrayList
         MainObj.bookList.add(new Book("Java Programming", "John Smith", 2021, 39.99));
         MainObj.bookList.add(new Book("Python Basics", "Jane Doe", 2020, 29.99));
         MainObj.bookList.add(new Book("C++ Essentials", "Michael Johnson", 2019, 49.99));

        Scanner scanner = new Scanner(System.in);
        
        while (true) 
        {
            // Display the menu options
            System.out.println("Select an option:");
            System.out.println("[1] Input new book");
            System.out.println("[2] Display specific book");
            System.out.println("[3] Display all books");
            System.out.println("[4] Display books priced above a certain amount");
            System.out.println("[5] Exit");

            System.out.println("Selected Option: ");
            int choice = scanner.nextInt();
    

            switch (choice) 
            {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    //displaySpecificBook();
                    break;
                case 3:
                    //displayAllBooks();
                    break;
                case 4:
                    System.out.print("Enter the minimum price: ");
                    double minPrice = scanner.nextDouble();
                    //filterBooks(book -> book.getPrice() > minPrice);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
    
            }
        }
    }
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

        MainObj.bookList.add(new Book(title, author, yearPublished, price));
        System.out.println("New book added successfully!");
    }


}

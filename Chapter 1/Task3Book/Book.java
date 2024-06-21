package Chapter;

public class Book {

      // Attributes of the Book class
      private String title;
      private String author;
      private int yearPublished;
      private double price;
  
      // Constructor to initialize the attributes
      public Book(String title, String author, int yearPublished, double price) {
          this.title = title;
          this.author = author;
          this.yearPublished = yearPublished;
          this.price = price;
      }
  
      // Method to print the details of the book
      public void printDetails() {
          System.out.println("Title: " + title);
          System.out.println("Author: " + author);
          System.out.println("Year Published: " + yearPublished);
          System.out.println("Price: $" + price);
      }
  
      // Getters for the attributes (used in predicates)
      public String getTitle() {
          return title;
      }
  
      public String getAuthor() {
          return author;
      }
  
      public int getYearPublished() {
          return yearPublished;
      }
  
      public double getPrice() {
          return price;
      }

}

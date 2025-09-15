class Book {
    String title;
    String author;
    double price;
    boolean available;

    
    Book(String t, String a, double p, boolean avail) {
        title = t;
        author = a;
        price = p;
        available = avail;
    }

   
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is already borrowed.");
        }
    }

    
    public String toString() {
        return "Title: " + title + ", Author: " + author + 
               ", Price: " + price + ", Available: " + available;
    }
}

public class p5 {
    public static void main(String[] args) {
        
        Book b1 = new Book("1984", "George Orwell", 299.99, true);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 199.50, true);

       
        System.out.println(b1);
        System.out.println(b2);

       
        b1.borrowBook();  
        b1.borrowBook();  

       
        System.out.println(b1);
        System.out.println(b2);
    }
}
class Product {
    String productName;   
    double price;        
    static int totalProducts = 0;  
   
    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;   

    }

    
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

   
    static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }
}

public class p7 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 25000.0);
        Product p3 = new Product("Headphones", 2000.0);

      
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

       
        Product.displayTotalProducts();
    }
}
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
        dailyRate = 1000.0; // default per-day rate
    }

    // Parameterized constructor
    CarRental(String c, String m, int d, double rate) {
        customerName = c;
        carModel = m;
        rentalDays = d;
        dailyRate = rate;
    }

    // Copy constructor
    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // toString method to display rental details
    public String toString() {
        return "Customer: " + customerName + ", Car: " + carModel +
               ", Days: " + rentalDays + ", Daily Rate: " + dailyRate +
               ", Total Cost: " + calculateTotalCost();
    }
}

public class p6 {
    public static void main(String[] args) {
        // Using default constructor
        CarRental r1 = new CarRental();

        // Using parameterized constructor
        CarRental r2 = new CarRental("Alice", "Honda City", 5, 1500.0);

        // Using copy constructor
        CarRental r3 = new CarRental(r2);

        // Display rentals
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
class Vehicle {
    String ownerName;       
    String vehicleType;    
    static double registrationFee = 1000.0; 

    
    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

   
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + 
                           ", Vehicle Type: " + vehicleType + 
                           ", Registration Fee: " + registrationFee);
    }

   
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("✅ Registration fee updated to: " + registrationFee);
    }
}

public class p9 {
    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        
        Vehicle.updateRegistrationFee(1500.0);

       
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
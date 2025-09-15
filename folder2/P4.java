class HotelBooking {
    String guestName;
    String roomType;
    int nights;

   
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

   
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

   
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

   
    public String toString() {
        return "Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights;
    }
}

public class p4 {
    public static void main(String[] args) {
        
        HotelBooking b1 = new HotelBooking();

        
        HotelBooking b2 = new HotelBooking("Alice", "Deluxe", 3);

       
        HotelBooking b3 = new HotelBooking(b2);

       
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
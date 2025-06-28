import java.util.*;

public class FlightBookingSystem {
    static String[] flights = {
        "Delhi to Mumbai",
        "Mumbai to Chennai",
        "Delhi to Bangalore"
    };
    static List<String> bookings = new ArrayList<>();

    static void searchFlight(String from, String to) {
        String search = from + " to " + to;
        boolean found = false;

        for (String flight : flights) {
            if (flight.equalsIgnoreCase(search)) {
                System.out.println("Flight found: " + flight);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Flight not found.");
        }
    }

    static void bookFlight(String from, String to) {
        String flight = from + " to " + to;
        boolean exists = false;

        for (String f : flights) {
            if (f.equalsIgnoreCase(flight)) {
                bookings.add(flight);
                System.out.println("Flight booked: " + flight);
                exists = true;
            }
        }

        if (!exists) {
            System.out.println("Booking failed. Flight not available.");
        }
    }

    static void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            System.out.println("Your bookings:");
            for (String b : bookings) {
                System.out.println(b);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Search Flight\n2. Book Flight\n3. Show Bookings\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("From: ");
                String from = sc.nextLine();
                System.out.print("To: ");
                String to = sc.nextLine();
                searchFlight(from, to);
            } else if (choice == 2) {
                System.out.print("From: ");
                String from = sc.nextLine();
                System.out.print("To: ");
                String to = sc.nextLine();
                bookFlight(from, to);
            } else if (choice == 3) {
                showBookings();
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
      
    }
}
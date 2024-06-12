import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Flight flight101 = new Flight("101", 100, 20, 5000, 15000);
        Flight flight102 = new Flight("102", 80, 30, 6000, 18000);

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter 1 to book a seat\nEnter 2 to cancel a booking\nEnter 3 to display flight summary\nEnter 4 to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter flight number (101 or 102):");
                    int flightNumber = scanner.nextInt();
                    scanner.nextLine();
                    if(flightNumber!=101 && flightNumber !=102) {
                        System.out.println("Invalid flight number..Exiting");
                        return;
                    }
                    Flight flight = flightNumber==101 ? flight101 : flight102;

                    System.out.println("Enter passenger name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter seat type (E For Economy or  B For Business):");
                    String seatType = scanner.nextLine();
                    System.out.println("Do you want to add a meal? (yes or no)");
                    boolean meal = scanner.nextLine().equalsIgnoreCase("yes");

                    flight.bookSeat(name, seatType, meal);
                    break;

                case 2:
                    System.out.println("Enter flight number (101 or 102):");
                    flightNumber = scanner.nextInt();
                    if(flightNumber!=101 && flightNumber !=102) {
                        System.out.println("Invalid flight number..Exiting");
                        return;
                    }
                    flight = flightNumber==101 ? flight101 : flight102;

                    System.out.println("Enter seat number:");
                    int seatNumber = scanner.nextInt();
                    scanner.nextLine();

                    flight.cancelBooking(seatNumber);
                    break;

                case 3:
                    System.out.println("Enter flight number (101 or 102):");
                    flightNumber = scanner.nextInt();
                    if(flightNumber!=101 && flightNumber !=102) {
                        System.out.println("Invalid flight number..Exiting");
                        return;
                    }
                    flight = flightNumber==101 ? flight101 : flight102;
                    flight.displayFlightSummary();
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
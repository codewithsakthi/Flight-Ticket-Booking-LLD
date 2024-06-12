import java.util.*;
class Flight {
    private String flightNumber;
    private ArrayList<Passenger> passengers;
    private int economySeats;
    private int businessSeats;
    private double economyBaseFare;
    private double businessBaseFare;
    private double surgePricing;
    private int economySeatCounter;
    private int businessSeatCounter;

    public Flight(String flightNumber, int economySeats, int businessSeats, double economyBaseFare, double businessBaseFare) {
        this.flightNumber = flightNumber;
        this.economySeats = economySeats;
        this.businessSeats = businessSeats;
        this.economyBaseFare = economyBaseFare;
        this.businessBaseFare = businessBaseFare;
        this.passengers = new ArrayList<>();
        this.surgePricing = 0;
        this.economySeatCounter = 1;
        this.businessSeatCounter = 1;
    }

    public void bookSeat(String name, String seatType, boolean meal) {
        if (seatType.equalsIgnoreCase("e")) {
            if (economySeats > 0) {
                double fare = economyBaseFare + (meal ? 500 : 0) + surgePricing;
                int seatNumber = economySeatCounter++;
                Passenger passenger = new Passenger(name, seatType, fare, seatNumber);
                passengers.add(passenger);
                economySeats--;
                System.out.println("Seat booked for " + name + " in Economy class. Seat Number: " + seatNumber + ", Fare: ₹" + fare);
                surgePricing += 50;
            } else {
                System.out.println("Sorry, no more Economy seats available.");
            }
        } else if (seatType.equalsIgnoreCase("b")) {
            if (businessSeats > 0) {
                double fare = businessBaseFare + (meal ? 1000 : 0) + surgePricing;
                int seatNumber = 100 + businessSeatCounter++;
                Passenger passenger = new Passenger(name, seatType, fare, seatNumber);
                passengers.add(passenger);
                businessSeats--;
                System.out.println("Seat booked for " + name + " in Business class. Seat Number: " + seatNumber + ", Fare: ₹" + fare);
                surgePricing += 100; // Surge pricing increment
            } else {
                System.out.println("Sorry, no more Business seats available.");
            }
        } else {
            System.out.println("Invalid seat type.");
        }
    }

    public void cancelBooking(int seatNumber) {
        for (Passenger passenger : passengers) {
            if (passenger.getSeatNumber() == seatNumber) {
                double refund = passenger.getFare() * 0.8;
                passengers.remove(passenger);
                if (passenger.getSeatType().equalsIgnoreCase("economy")) {
                    economySeats++;
                } else {
                    businessSeats++;
                }
                System.out.println("Booking canceled for Seat Number " + seatNumber + ". Refund amount: ₹" + refund);
                return;
            }
        }
        System.out.println("No booking found for Seat Number " + seatNumber);
    }

    public void displayFlightSummary() {
        System.out.println("Flight Summary for " + flightNumber);
        System.out.println("Passengers:");
        for (Passenger passenger : passengers) {
            System.out.println("Name: " + passenger.getName() + ", Seat Number: " + passenger.getSeatNumber() + " (" + passenger.getSeatType() + ") - ₹" + passenger.getFare());
        }
        System.out.println("Remaining seats: Economy - " + economySeats + ", Business - " + businessSeats);
    }
}
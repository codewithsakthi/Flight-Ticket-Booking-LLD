import java.util.*;
class Passenger {
    private String name;
    private String seatType;
    private double fare;
    private int seatNumber;

    public Passenger(String name, String seatType, double fare, int seatNumber) {
        this.name = name;
        this.seatType = seatType;
        this.fare = fare;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public String getSeatType() {
        return seatType;
    }

    public double getFare() {
        return fare;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
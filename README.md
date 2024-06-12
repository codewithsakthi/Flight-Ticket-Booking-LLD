# Flight Booking System

This is a simple Java program that simulates a flight booking system. It allows users to book seats, cancel bookings, and view flight summaries for two flights: 101 and 102. The program includes features such as seat availability checks, meal options, surge pricing, and cancellation refunds.

## Features

- Book seats in Economy or Business class
- Add meal option during booking
- Surge pricing (fare increment after each successful booking)
- Cancel bookings and receive refunds (with a 20% cancellation fee)
- Display flight summary with passenger details, seat numbers, and remaining seats

## How to Run

1. Make sure you have Java installed on your system.
2. Clone or download the repository.
3. Open the project in your preferred Java IDE or navigate to the project directory using a terminal.
4. Compile the `FlightBookingSystem.java` file.
5. Run the compiled code.

## Usage

1. Upon running the program, you will be presented with a menu:
   - Enter 1 to book a seat
   - Enter 2 to cancel a booking
   - Enter 3 to display the flight summary
   - Enter 4 to exit

2. **Booking a Seat**:
   - Enter the flight number (101 or 102)
   - Enter the passenger's name
   - Enter the seat type (Economy or Business)
   - Indicate whether you want to add a meal (yes or no)
   - The program will display the booked seat number and the total fare (including meal charges and surge pricing)

3. **Canceling a Booking**:
   - Enter the flight number (101 or 102)
   - Enter the seat number
   - The program will cancel the booking and display the refund amount (80% of the fare)

4. **Displaying Flight Summary**:
   - Enter the flight number (101 or 102)
   - The program will display the flight summary, including the list of passengers with their names, seat numbers, seat types, and fares, as well as the remaining seats in each class.

5. **Exiting the Program**:
   - Enter 4 to exit the program.

## Code Structure

The program consists of the following classes:

- `Flight`: Represents a flight with its number, seat capacities, base fares, and passenger management methods.
- `Passenger`: Represents a passenger with their name, seat type, fare, and seat number.
- `FlightBookingSystem`: The main class that runs the program and handles user input.

## Assumptions and Limitations

- The program assumes two pre-defined flights (101 and 102) with fixed seat capacities and base fares.
- The program does not persist data between runs; all bookings and flight information are lost when the program is terminated.
- The program does not include error handling for invalid user inputs.
- The program does not include additional features like date/time selection, user authentication, or integration with external systems.

## Future Enhancements

- Add data persistence using file or database storage
- Implement error handling and input validation
- Add additional features like date/time selection, user authentication, and integration with external systems
- Improve the user interface with a graphical user interface (GUI) or a web-based interface

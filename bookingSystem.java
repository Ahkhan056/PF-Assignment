import java.util.Scanner;

public class bookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 5;
        int cols = 5;
        int[][] seats = new int[rows][cols];  // 2D array to represent the seating arrangement
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("\nCinema Booking System Menu:");
            System.out.println("1. Display Seating Arrangement");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    // Display current seating arrangement
                    System.out.println("Current Seating Arrangement:");
                    for (int i = 0; i < seats.length; i++) {
                        for (int j = 0; j < seats[i].length; j++) {
                            System.out.print(seats[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Book a seat
                    System.out.print("Enter row number (0-4): ");
                    int rowToBook = sc.nextInt();
                    System.out.print("Enter seat number (0-4): ");
                    int seatToBook = sc.nextInt();
                    if (rowToBook >= 0 && rowToBook < seats.length && seatToBook >= 0 && seatToBook < seats[0].length) {
                        if (seats[rowToBook][seatToBook] == 0) {
                            seats[rowToBook][seatToBook] = 1;  // Mark seat as booked
                            System.out.println("Seat booked successfully.");
                        } else {
                            System.out.println("Sorry, the seat is already booked.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;

                case 3:
                    // Cancel a booking
                    System.out.print("Enter row number (0-4): ");
                    int rowToCancel = sc.nextInt();
                    System.out.print("Enter seat number (0-4): ");
                    int seatToCancel = sc.nextInt();
                    if (rowToCancel >= 0 && rowToCancel < seats.length && seatToCancel >= 0 && seatToCancel < seats[0].length) {
                        if (seats[rowToCancel][seatToCancel] == 1) {
                            seats[rowToCancel][seatToCancel] = 0;  // Mark seat as available
                            System.out.println("Booking cancelled successfully.");
                        } else {
                            System.out.println("Seat is not booked.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;

                case 4:
                    running = false;  // Exit the loop
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        sc.close();  // Close the scanner
    }
}


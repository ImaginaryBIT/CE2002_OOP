package lab3;

import java.util.Scanner;

public class PlaneApp {

	public static void main(String[] args) {

		int choice, seatID, customerID;
		Plane planeObject = new Plane();

		// create a Scanner object here
		Scanner sc = new Scanner(System.in);

		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");

		do {

			// read user input
			System.out.println("\nEnter the number of your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				// Show number of empty seats
				planeObject.showNumEmptySeats();

				break;

			case 2:
				// Show list of empty seats
				planeObject.showEmptySeats();

				break;

			case 3:
				// Show the list of seat assignments by seat ID
				planeObject.showAssignedSeats(true);

				break;

			case 4:
				// Show the list of seat assignments by customer ID
				planeObject.showAssignedSeats(false);

				break;

			case 5:
				// Assign customer to seat
				System.out.println("Assigning Seat...");

				System.out.print("Please enter SeatID: ");

				seatID = sc.nextInt();

				System.out.print("Please enter customerID: ");

				customerID = sc.nextInt();

				planeObject.assignSeat(seatID, customerID);

				break;

			case 6:
				// Remove seat assignment
				System.out.print("Please enter SeatID: ");

				seatID = sc.nextInt();

				planeObject.unAssignSeat(seatID);


				break;

			case 7:
				// Do nothing. Going to terminate

				break;
			}
		} while (choice != 7);

	}
}

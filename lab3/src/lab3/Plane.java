package lab3;

import java.util.Arrays;

public class Plane {
	private PlaneSeat[] seat;

	private int numEmptySeat;

	public Plane() {
		seat = new PlaneSeat[12];

		numEmptySeat = 12;

		for (int i = 0; i < seat.length; i++) {
			seat[i] = new PlaneSeat(i + 1);
		}
	}

	private PlaneSeat[] sortSeats() {
		
		Arrays.sort(seat);
		return seat;
	}

	public void showNumEmptySeats() {

		System.out.println("There are " + numEmptySeat + " empty seats.");
	}

	public void showEmptySeats() {
		
		System.out.println("The following seats are empty: ");

		for (int i = 0; i < seat.length; i++) {
			if (!seat[i].isOccupied())

				System.out.println("SeatID " + seat[i].getSeatID());
		}
	}

	public void showAssignedSeats(boolean bySeatId) {
		
		System.out.println("The seat assignment are as follow:");

		if (bySeatId) 
		{
			for (int i = 0; i < seat.length; i++) {
				if (seat[i].isOccupied() == true)

					System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID "
							+ seat[i].getCustomerID() + ".");
			}
		} 
		else 
		{
			//???
			//seat = sortSeats();

			for (int i = 0; i < seat.length; i++) {
				if (seat[i].isOccupied() == true)

					System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID "
							+ seat[i].getCustomerID() + ".");
			}
		}

	}

	public void assignSeat(int seatId, int cust_id) {
		for (int i = 0; i < seat.length; i++) {
			
			if(seat[i].getSeatID() == seatId)
			{

				if (!seat[i].isOccupied()) 
				{
	
					seat[i].assign(cust_id);
	
					numEmptySeat--;
	
					System.out.println("Seat Assigned!");
	
				}
	
				else 
				{
					System.out.println("Seat already assigned to a customer.");
				}
			
			}
		}
	}

	public void unAssignSeat(int seatId) {
		
		for (int i = 0; i < seat.length; i++) {

			if (seat[i].getSeatID() == seatId) {

				if (seat[i].isOccupied()) {

					seat[seatId].unAssign();

					System.out.print("Seat Unassigned!");

				}

				else 
				{
					System.out.println("Seat not occupied.");
				}

			}
		}

		
	}

}

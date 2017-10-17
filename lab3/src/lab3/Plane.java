package lab3;

import java.util.*;
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
		
/*		Arrays.sort(seat, new Comparator<PlaneSeat>()
		{
			public int compare(PlaneSeat ps1, PlaneSeat ps2) 
			{
				return ps1.getCustomerID() - ps2.getCustomerID();
			}
			
		});
		
		return seat;*/
		PlaneSeat[] seatCopy = seat.clone();
		PlaneSeat temp;
		
		for (int i = 1; i < seatCopy.length; i++) 
		{
			for(int j = i; j>0; j--) 
			{
				if(seatCopy[j].getCustomerID()<seatCopy[j-1].getCustomerID())
				{
					temp = seatCopy[j];
					seatCopy[j] = seatCopy[j-1];
					seatCopy[j-1] = temp;
				}
				else
					break;
			}
			
		}
		
		return seatCopy;
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

		if (!bySeatId)
			{
				for (int i = 0; i < sortSeats().length; i++) 
				{
					if (sortSeats()[i].isOccupied() == true)
	
						System.out.println("SeatID " + sortSeats()[i].getSeatID() + " assigned to CustomerID "
								+ sortSeats()[i].getCustomerID() + ".");
				}
			}
		else
		{
			for (int i = 0; i < seat.length; i++) 
			{
				if (seat[i].isOccupied() == true)

					System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID "
							+ seat[i].getCustomerID() + ".");
			}
		}
	}

	public void assignSeat(int seatId, int cust_id) 
	{
		for (int i = 0; i < seat.length; i++) 
		{
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

	public void unAssignSeat(int seatId) 
	{
		for (int i = 0; i < seat.length; i++)
		{
			if (seat[i].getSeatID() == seatId) 
			{
				if (seat[i].isOccupied()) 
				{
					seat[i].unAssign();
					
					numEmptySeat++;

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

package lab3;

public class Plane
{

	private PlaneSeat [] seat = new PlaneSeat[12];
	private int numEmptySeat;
	
	public Plane() 
	{
		//?
	}
	
	private PlaneSeat[] sortSeats() 
	{
		seat.getSeatID();
		for(int i=0;i<=11;i++)
		{
			seat[i].getSeatID();
		}
		return seat;
	}
	
	public  void showNumEmptySeats()
	{
		for(int i=0;i<=11;i++)
		{
			if(seat[i].isOccupied()==false)
				
				numEmptySeat++;
		}
		System.out.println("There are " + numEmptySeat + " empty seats.");
	}
	
	public  void showEmptySeats()
	{
		
		for(int i=0;i<=11;i++)
		{
			if(seat[i].isOccupied()==false)
				
				System.out.println("SeatID " + seat[i].getSeatID());
		}
	}
	
	public  void showAssignedSeats(boolean bySeatId)
	{
		
		if(bySeatId == true) 
		{
			for(int i=0;i<=11;i++)
			{
				if(seat[i].isOccupied()==true)
					
					System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID() + ".");
			}
		}
		else 
		{
			seat = sortSeats();
			
			for(int i=0;i<=11;i++)
			{
				if(seat[i].isOccupied()==true)
					
					System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID() + ".");
			}
		}
		
	}
	
	public void assignSeat(int seatId, int cust_id) 
	{
		for(int i=0;i<=11;i++)
		{
			if(seat[i].isOccupied()==false)
				
				seat[i].assign(cust_id);
		}
	}
	
	public void unAssignSeat(int seatId) 
	{
		seat[seatId].unAssign();
	}

}

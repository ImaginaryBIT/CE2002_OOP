package Sales;

public class SalePerson implements Comparable{
	
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String lastName, String firstName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	
	public String toString(){
		String line;
		line = "<" +this.lastName + ">,<" + this.firstName + "> : <" + totalSales + ">";
		return line;
	}
	
	public boolean equals(Object o) {
		
		if(this == o) return true;
		
		if(!(o instanceof SalePerson)) return false;
		
		final SalePerson other = (SalePerson) o;
		
		if(this.firstName.equals(other.getFirstName()) && this.lastName.equals(other.getLastName()))
		
			return true;
		
		else
			return false;
	}
	
	public int compareTo(Object o) {
		
		SalePerson other = (SalePerson) o;
		
		if(this.totalSales > other.totalSales)
			
			return 1;
		
		if(this.totalSales < other.totalSales)
			
			return -1;
		
		if(this.lastName.compareTo(other.getLastName()) > 0)
			
			return 1;
		
		if(this.lastName.compareTo(other.getLastName()) < 0)
			
			return -1;
		
		return 0;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getTotalSales() {
		return this.totalSales;
	}

}

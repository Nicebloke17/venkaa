package busreservation;

public class Bus {
	private int Busno;
	private Boolean Ac;
	private int Capacity;
	
	
	
	
	public int getBusno() {
		return Busno;
	}
	public void setBusno(int busno) {
		Busno = busno;
	}
	public Boolean getAc() {
		return Ac;
	}
	public void setAc(Boolean value) {
		Ac = value;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
	Bus(int Busno, Boolean Ac, int Capacity){
		this.Busno = Busno;
		this.Ac = Ac;
		this.Capacity = Capacity;
	}
	
	public void display () {
		System.out.println("Busno=     "     + Busno    +       "Ac=     "     + Ac     +   "Capacity =    "    + Capacity);
		
		
		
				
	}

}

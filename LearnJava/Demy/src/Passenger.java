
public class Passenger {
	void takeTicket() {
		Money m = new Money();
		Conductor c = new Conductor();
	    Ticket t = c.give(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger p = new Passenger();
		p.takeTicket();
		System.out.println("Passenger Take Ticket");

	}

}

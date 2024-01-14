import java.util.ArrayList;

public class AmusementParkRide {
	private String name;
	private int lowestHeight;
	private int visitors;
	private ArrayList<Person> riding;

	public AmusementParkRide(String name, int lowestHeight) {
		this.name = name;
		this.lowestHeight = lowestHeight;
		this.visitors = 0;
		this.riding = new ArrayList<>();
	}

	public boolean allowedToRide(Person person) {
		if (person.getHeight() < this.lowestHeight) {
			return false;
		}

		this.visitors++;
		this.riding.add(person);
		return true;
	}

	public String toString() {

		String printOutput = this.name + ", minimum height requirement: " + this.lowestHeight + ", visitors: "
				+ this.visitors + "\n";

		if (riding.isEmpty()) {
			return printOutput + "no one is on the ride.";
		}

		// we form a string from the people on the list
		String peopleOnRide = "";

		for (Person person : riding) {
			peopleOnRide = peopleOnRide + person.getName() + "\n";
		}

		return printOutput + "\n" + "on the ride:\n" + peopleOnRide;
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a scanner object to read user input
		Scanner scan = new Scanner(System.in);

		// Create an instance of BirdDatabase to manage bird data
		BirdDatabase birdie = new BirdDatabase();

		// Continuously prompt the user for input until program termination
		while (true) {
			System.out.println("? "); // Prompt user for input
			String userCommand = scan.nextLine(); // Read user's command

			// Execute different actions based on user's command
			switch (userCommand) {
			case "Add":
				// Call method to add a new bird to the database
				birdie.addBird(scan);
				break;
			case "Observation":
				// Call method to record an observation of a bird
				birdie.observeBird(scan);
				break;
			case "All":
				// Call method to retrieve information about all birds in the database
				birdie.retrieveAllBirds();
				break;
			case "One":
				// Call method to retrieve information about a specific bird
				birdie.retrieveOneBird(scan);
				break;
			case "Quit":
				// Terminate the program
				return;
			default:
				// Inform the user about unsupported option
				System.out.println("Sorry. Unsupported option.");
				break;
			}
		}
	}
}

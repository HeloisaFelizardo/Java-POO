import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a database of birds, allowing users to add new birds, record
 * observations, and retrieve information about birds.
 */
public class BirdDatabase {

	private final ArrayList<Bird> listOfBirds; // List to store birds in the database
	private boolean foundBird; // Flag to track if a bird is found

	/**
	 * Constructs a BirdDatabase object with an empty list of birds.
	 */
	public BirdDatabase() {
		this.listOfBirds = new ArrayList<>();
		this.foundBird = false;
	}

	/**
	 * Adds a new bird to the database.
	 * 
	 * @param input Scanner object to read user input.
	 */
	public void addBird(Scanner input) {
		String birdName = getValidInput(input, "Name");
		String latinName = getValidInput(input, "Name in Latin");
		listOfBirds.add(new Bird(birdName, latinName));
	}

	/**
	 * Prompts the user for input until a non-empty value is provided.
	 * 
	 * @param input     Scanner object to read user input.
	 * @param fieldName The name of the field being prompted for.
	 * @return The non-empty user input.
	 */
	private String getValidInput(Scanner input, String fieldName) {
		String userInput = "";
		while (userInput.isEmpty()) {
			System.out.println(fieldName + ": ");
			userInput = input.nextLine();
			if (userInput.isEmpty()) {
				System.out.println("Please provide a value for " + fieldName + ".");
			}
		}
		return userInput;
	}

	/**
	 * Records an observation of a bird by increasing its observation count.
	 * 
	 * @param input Scanner object to read user input.
	 */
	public void observeBird(Scanner input) {
		System.out.println("Bird? ");
		String birdName = input.nextLine();
		for (Bird bird : this.listOfBirds) {
			if (birdName.equals(bird.getCommonName())) {
				bird.makeObservation();
				foundBird = true;
			}
		}

		if (!foundBird) {
			System.out.println("Not a bird!");
		}
	}

	/**
	 * Retrieves information about all birds in the database.
	 */
	public void retrieveAllBirds() {
		for (Bird bird : this.listOfBirds) {
			System.out.println(bird);
		}
	}

	/**
	 * Retrieves information about a specific bird in the database.
	 * 
	 * @param input Scanner object to read user input.
	 */
	public void retrieveOneBird(Scanner input) {
		System.out.println("Bird? ");
		String birdName = input.nextLine();
		for (Bird bird : this.listOfBirds) {
			if (bird.getCommonName().contains(birdName)) {
				System.out.println(bird);
				foundBird = true;
			}
		}

		if (!foundBird) {
			System.out.println("Not a bird!");
		}
	}
}

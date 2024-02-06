/**
 * Represents a bird with its common name, Latin name, and number of
 * observations.
 */
public class Bird {

	// Fields to store bird data
	public String commonName;
	public String latinName;
	public int numberOfObservations;

	/**
	 * Constructs a Bird object with the given common name and Latin name.
	 * Initializes the number of observations to 0.
	 * 
	 * @param name      The common name of the bird.
	 * @param latinName The Latin name of the bird.
	 */
	public Bird(String name, String latinName) {
		this.commonName = name;
		this.latinName = latinName;
		this.numberOfObservations = 0;
	}

	/**
	 * Gets the common name of the bird.
	 * 
	 * @return The common name.
	 */
	public String getCommonName() {
		return this.commonName;
	}

	/**
	 * Gets the Latin name of the bird.
	 * 
	 * @return The Latin name.
	 */
	public String getLatinName() {
		return this.latinName;
	}

	/**
	 * Gets the number of observations made for the bird.
	 * 
	 * @return The number of observations.
	 */
	public int getNumberOfObservations() {
		return this.numberOfObservations;
	}

	/**
	 * Increases the number of observations for the bird by 1.
	 */
	public void makeObservation() {
		this.numberOfObservations++;
	}

	/**
	 * Returns a string representation of the bird, including its common name, Latin
	 * name, and number of observations.
	 * 
	 * @return String representation of the bird.
	 */
	@Override
	public String toString() {
		return this.getCommonName() + " (" + this.getLatinName() + "): " + this.getNumberOfObservations()
				+ " observations";
	}
}

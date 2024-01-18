import java.util.ArrayList;

public class WordSet {
	private ArrayList<String> words;

	public WordSet() {
		this.words = new ArrayList<>();
	}

	public void add(String word) {
		this.words.add(word);
	}

	public boolean contains(String word) {
		return this.words.contains(word);
	}

	public int palindromes() {
		int count = 0;

		for (String word : this.words) {
			if (isPalindrome(word)) {
				count++;
			}
		}

		return count;
	}

	public boolean isPalindrome(String word) {
		int end = word.length() - 1;

		int i = 0;
		while (i < word.length() / 2) {
			// method charAt returns the character at given index
			// as a simple variable
			if (word.charAt(i) != word.charAt(end - i)) {
				return false;
			}

			i++;
		}

		return true;
	}
}
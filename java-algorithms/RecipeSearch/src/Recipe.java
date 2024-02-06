import java.util.ArrayList;

// Class representing a recipe
public class Recipe {
    
    // Fields for recipe name, cooking time, and ingredients
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;
   
    // Constructor to initialize recipe with name and cooking time
    public Recipe(String recipeName, int cookingTime) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
  
    // Override toString method to provide a string representation of the recipe
    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }

    // Getter method for recipe name
    public String getRecipeName() {
        return recipeName;
    }

    // Getter method for cooking time
    public int getCookingTime() {
        return cookingTime;
    }
    
    // Method to add ingredient to the recipe
    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

    // Getter method for ingredients
    public ArrayList<String> getIngredients() {
        return ingredients;
    }   
}

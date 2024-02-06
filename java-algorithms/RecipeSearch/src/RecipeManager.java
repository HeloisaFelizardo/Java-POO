import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// Class to manage recipes
public class RecipeManager {
    
    private final ArrayList<Recipe> listOfRecipes;
    
    // Constructor to initialize ArrayLists
    public RecipeManager() {       
        this.listOfRecipes = new ArrayList<>();
    }
    
    // Method to read recipes from a file
    public void readRecipe(String fileName) {
        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNextLine()) {
                // Read recipe name
                String recipeName = input.nextLine();
                // Read cooking time
                int cookingTime = Integer.valueOf(input.nextLine());
                // Create a new recipe object
                Recipe recipe = new Recipe(recipeName, cookingTime);
                // Add recipe to the list
                listOfRecipes.add(recipe);
                // Read ingredients until an empty line is encountered
                while (input.hasNextLine()) {
                    String ingredient = input.nextLine();
                    // If empty line encountered, exit the loop
                    if (ingredient.isEmpty()) {
                        break;
                    }  
                    // Add ingredient to the current recipe
                    recipe.addIngredients(ingredient);
                }            
            }
        } catch (Exception e) {
            // Print error message if an exception occurs
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Method to list all recipes
    public void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe : listOfRecipes) {
            System.out.println(recipe);
        }
    }
    
    // Method to find recipes by name
    public void findName(String nameToSearch) {
        System.out.println("Recipes: ");
        for (Recipe recipe : listOfRecipes) {
            if (recipe.getRecipeName().contains(nameToSearch)) {
                System.out.println(recipe);
            }
        }
    }
    
    // Method to find recipes by cooking time
    public void findCookingTime(int maxCookingTime) {
        System.out.println("Recipes: ");
        for (Recipe recipe : listOfRecipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }   
    
    // Method to find recipes by ingredient
    public void findIngredient(String ingredient) {
        for (int i = 0; i < listOfRecipes.size(); i++) {
            if (listOfRecipes.get(i).getIngredients().contains(ingredient)) {
                System.out.println(listOfRecipes.get(i));
            }
        }
    }
}

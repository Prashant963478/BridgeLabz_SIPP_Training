package generics_package;

//Base interface for all meal types
interface MealPlan {
 void displayMeal(); 
}

//Vegetarian meal implementation
class VegetarianMeal implements MealPlan {
 public void displayMeal() {
     System.out.println("Vegetarian Meal: Paneer Curry, Rice, Salad");
 }
}

//Vegan meal implementation
class VeganMeal implements MealPlan {
 public void displayMeal() {
     System.out.println("Vegan Meal: Tofu Stir-Fry, Quinoa, Avocado");
 }
}

//Keto meal implementation
class KetoMeal implements MealPlan {
 public void displayMeal() {
     System.out.println("Keto Meal: Grilled Chicken, Broccoli, Cheese");
 }
}

//High-protein meal implementation
class HighProteinMeal implements MealPlan {
 public void displayMeal() {
     System.out.println("High Protein Meal: Eggs, Lentils, Chicken Breast");
 }
}

//Generic class 
class Meal<T extends MealPlan> {
 private T meal; 

 //Constructor
 public Meal(T meal) {
     this.meal = meal;
 }

 public void serveMeal() {
     meal.displayMeal();
 }
}

//Generic utility class 
class MealGenerator {
	
 //Generic method to generate any type of MealPlan
 public static <T extends MealPlan> Meal<T> generateMeal(T meal) {
     System.out.println("Generating personalized meal plan...");
     return new Meal<>(meal); // Wrap the meal into a Meal object
 }
}

//Main class
public class PersonalizedMealPlanGenerator {
 public static void main(String[] args) {
	 
     //Create instances of different meal types
     VegetarianMeal veg = new VegetarianMeal();
     VeganMeal vegan = new VeganMeal();
     KetoMeal keto = new KetoMeal();
     HighProteinMeal highProtein = new HighProteinMeal();

     //Generate personalized meals using the generic method
     Meal<VegetarianMeal> vegMeal = MealGenerator.generateMeal(veg);
     Meal<VeganMeal> veganMeal = MealGenerator.generateMeal(vegan);
     Meal<KetoMeal> ketoMeal = MealGenerator.generateMeal(keto);
     Meal<HighProteinMeal> highProteinMeal = MealGenerator.generateMeal(highProtein);

     vegMeal.serveMeal();
     veganMeal.serveMeal();
     ketoMeal.serveMeal();
     highProteinMeal.serveMeal();
 }
}

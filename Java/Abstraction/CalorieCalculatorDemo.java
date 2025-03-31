abstract class CalorieCalculator {
    String foodItem;
    double quantity;
    
    public CalorieCalculator(String foodItem, double quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
    }
    
    abstract double calculateCalories();
    
    public void displayInfo() {
        System.out.println("Food Item: " + foodItem + " | Quantity: " + quantity + " grams");
    }
}


class RiceCalorieCalculator extends CalorieCalculator {
    private static final double CALORIES_PER_GRAM = 1.3; 
    public RiceCalorieCalculator(double quantity) {
        super("Rice", quantity);
    }
    
    
    public double calculateCalories() {
        return quantity * CALORIES_PER_GRAM;
    }
}


public class CalorieCalculatorDemo {
    public static void main(String[] args) {
        CalorieCalculator myMeal = new RiceCalorieCalculator(200);
        
        myMeal.displayInfo();
        System.out.println("Total Calories: " + myMeal.calculateCalories() + " kcal");
    }
}

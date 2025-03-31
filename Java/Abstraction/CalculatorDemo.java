
interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

class SimpleCalculator implements Calculator {

    public double add(double a, double b) {
        return a + b;
    }
    

    public double subtract(double a, double b) {
        return a - b;
    }
    

    public double multiply(double a, double b) {
        return a * b;
    }
    
  
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}


public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new SimpleCalculator();
        
        double num1 = 10, num2 = 5;
        
        System.out.println("Addition: " + myCalculator.add(num1, num2));
        System.out.println("Subtraction: " + myCalculator.subtract(num1, num2));
        System.out.println("Multiplication: " + myCalculator.multiply(num1, num2));
        System.out.println("Division: " + myCalculator.divide(num1, num2));
    }
}

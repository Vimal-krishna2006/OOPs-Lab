
class Calculator {
    
    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }


    void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}


class MultiplyCalculator extends Calculator {
   
    void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
}

class divideCalculator extends MultiplyCalculator {
    
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class SciCalc {
    public static void main(String[] args) {
      
        divideCalculator scCalculator = new divideCalculator();
        
    
        scCalculator.add(10, 5);  // Output: Addition: 15
        scCalculator.subtract(10, 5);  // Output: Subtraction: 5
        scCalculator.multiply(10, 5);  // Output: Multiplication: 50
        scCalculator.divide(10, 5);  // Output: Division: 2
        scCalculator.divide(10, 0);  // Output: Division by zero is not allowed.
    }
}

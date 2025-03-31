class Calculator {
    
    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}


class Multiplier extends Calculator {
    
    void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
}


class Divider extends Calculator {
    
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class Calculation {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        Divider divider = new Divider();

        multiplier.add(10, 5);  // Output: Addition: 15
        multiplier.subtract(10, 5);  // Output: Subtraction: 5
        multiplier.multiply(10, 5);  // Output: Multiplication: 50

        divider.add(20, 10);  // Output: Addition: 30
        divider.subtract(20, 10);  // Output: Subtraction: 10
        divider.divide(20, 5);  // Output: Division: 4
        divider.divide(20, 0);  // Output: Division by zero is not allowed.
    }
}

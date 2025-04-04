public class LangPackageDemo {
    public static void main(String[] args) {
   
        String message = "Hello, World!";
        
        
        System.out.println(message);
        
        double number = 25.0;
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + sqrt);
        
        
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        
     
        
        
        try {
            // Using java.lang.Integer
            int parsed = Integer.parseInt("123");
            System.out.println("Parsed integer: " + parsed);
            
            
            int zero = 0;
            int result = 10 / zero;
        } catch (NumberFormatException e) {
            System.out.println("Number format error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        }
    }
}
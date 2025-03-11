import java.util.Scanner;

public class RTPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line
        }
    }
}

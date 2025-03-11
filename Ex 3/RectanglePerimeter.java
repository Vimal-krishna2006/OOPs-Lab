import java.util.Scanner;

public class RectanglePerimeter {

       public int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for inputs
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        // Calculate and display the perimeter
        int perimeter = calculatePerimeter(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}

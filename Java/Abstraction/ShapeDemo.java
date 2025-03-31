
abstract class Shape {
    String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    abstract double calculateArea();
    abstract double calculatePerimeter();
    
    public void displayInfo() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


public class ShapeDemo {
    public static void main(String[] args) {
        Shape myCircle = new Circle("Circle", 5.0);
        
        myCircle.displayInfo();
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Perimeter: " + myCircle.calculatePerimeter());
    }
}

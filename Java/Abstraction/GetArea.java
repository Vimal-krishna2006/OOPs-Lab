interface Shapes{
    double getArea();
}

class Circle{
    double radius;

    public Circle(double r){
        this.radius=r;
    }

    double getArea(){
        return 3.14*radius*radius;
    }
}

class Rectangle{
    double length;
    double breadth;

    public Rectangle(double l, double b){
        this.length=l;
        this.breadth=b;
    }

    double getArea(){
        return length*breadth;
    }
}

public class GetArea{
    public static void main(String[] args){
        Circle obj1= new Circle(100.0);
        double c = obj1.getArea();
        System.out.println(c);

        Rectangle obj2= new  Rectangle(100.0, 100.0);
        c = obj2.getArea();
        System.out.println(c);
    }
}

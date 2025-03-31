class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }


    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}


class Bike extends Vehicle {
    boolean hasBasket;

    Bike(String brand, int year, boolean hasBasket) {
        super(brand, year);
        this.hasBasket = hasBasket;
    }

  
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Basket: " + hasBasket);
    }
}


public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020, 4);
        Bike bike = new Bike("Hero", 2019, true);

        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println("\nBike Details:");
        bike.displayInfo();
    }
}
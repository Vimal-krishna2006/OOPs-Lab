class Employee {
    // Method to display employee details
    public void showDetails() {
        System.out.println("Employee details");
    }
}

class Manager extends Employee {
    // Overriding the method in the Manager class
    @Override
    public void showDetails() {
        System.out.println("Manager details");
    }
}

class Developer extends Employee {
    // Overriding the method in the Developer class
    @Override
    public void showDetails() {
        System.out.println("Developer details");
    }
}

public class Details {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();
        
        emp1.showDetails(); // Calls Manager's overridden method
        emp2.showDetails(); // Calls Developer's overridden method
    }
}

interface Employee {
    void displayEmployeeDetails();  
    double calculateSalary(); 
    void employeeInfo(); 
}

class FullTimeEmployee implements Employee {
    private String name;
    private double baseSalary;
    
    public FullTimeEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
   
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
    }
    
 
    public double calculateSalary() {
        double bonus = baseSalary * 0.10; // 10% bonus
        return baseSalary + bonus;
    }
    

    public void employeeInfo() {
        System.out.println("Full-Time Employee with benefits and yearly bonus.");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee("Alice Johnson", 5000.00);
        emp.employeeInfo();
        emp.displayEmployeeDetails();
        
        System.out.println("Total Salary with Bonus: $" + emp.calculateSalary());
    }
}

class Employee {
    
    private int id;
    private String name;
    private String department;
    private double salary;
    private int yearsOfExperience;

    
    public Employee(int id, String name, String department, double salary, int yearsOfExperience) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    
    public void setName(String name) {        
            this.name = name;      
    }

    public void setDepartment(String department) {       
            this.department = department;
        }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience >= 0) {
            this.yearsOfExperience = yearsOfExperience;
        } else {
            System.out.println("Error: Years of experience cannot be negative.");
        }
    }

    
    


    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("\nEmployee Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of Experience: " + yearsOfExperience);
        
    }
}

// Main.java
public class EncapEmp {
    public static void main(String[] args) {
      
        Employee emp1 = new Employee(101, "Alice Johnson", "Engineering", 75000.0, 4);
        Employee emp2 = new Employee(102, "Bob Smith", "Marketing", 65000.0, 2);

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();

      
        
        emp2.setYearsOfExperience(3); 

        
        System.out.println("\nAfter updates:");
       
        emp2.displayEmployeeInfo();

    }
}
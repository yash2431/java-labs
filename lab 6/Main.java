import java.util.Scanner;

class Member {
     String name;
     int age;
     String phoneNumber;
     String address;
     double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary of " + name + " is: " + salary);
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public void displayManagerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Age: ");
        int empAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Phone Number: ");
        String empPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String empAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double empSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Specialization: ");
        String empSpecialization = scanner.nextLine();

        Employee employee = new Employee(empName, empAge, empPhoneNumber, empAddress, empSalary, empSpecialization);

        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Age: ");
        int mgrAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone Number: ");
        String mgrPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String mgrAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Department: ");
        String mgrDepartment = scanner.nextLine();

        Manager manager = new Manager(mgrName, mgrAge, mgrPhoneNumber, mgrAddress, mgrSalary, mgrDepartment);

        System.out.println("\nEmployee Details:");
        employee.displayEmployeeDetails();
        employee.printSalary();

        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
        manager.printSalary();

        scanner.close();
    }
}

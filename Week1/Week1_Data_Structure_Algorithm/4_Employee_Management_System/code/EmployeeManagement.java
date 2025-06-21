
import java.util.Arrays;

class Employee {
    String employeeId;
    String name;
    String position;
    double salary;

    public Employee(String employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + employeeId + ", Name=" + name + ", Position=" + position + ", Salary=" + String.format("%.2f", salary) + "]";
    }
}

class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (count >= employees.length) {
            System.out.println("Error: Array is full. Cannot add new employee.");
            return false;
        }
        employees[count] = employee;
        count++;
        return true;
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        System.out.println("All Employee Records:");
        for (int i = 0; i < count; i++) {
            System.out.println("  " + employees[i]);
        }
        System.out.println();
    }

    public boolean deleteEmployee(String employeeId) {
        int indexToDelete = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("Error: Employee with ID " + employeeId + " not found.");
            return false;
        }

        for (int i = indexToDelete; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;
        return true;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E001", "Alice", "Developer", 70000));
        manager.addEmployee(new Employee("E002", "Bob", "Manager", 90000));
        manager.addEmployee(new Employee("E003", "Charlie", "Analyst", 65000));

        manager.traverseEmployees();

        System.out.println("Searching for employee E002...");
        Employee found = manager.searchEmployee("E002");
        if (found != null) {
            System.out.println("Found: " + found + "\n");
        } else {
            System.out.println("Employee not found.\n");
        }

        System.out.println("Deleting employee E001...");
        manager.deleteEmployee("E001");

        manager.traverseEmployees();
    }
}

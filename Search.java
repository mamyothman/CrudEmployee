import java.util.Scanner;

public class Search {
    public void searchEmployee(Employee[] employees, Scanner scanner) {
        // Code to search for an employee in the array
        System.out.println("Enter the employee ID to search for: ");
        int id = scanner.nextInt();
         // Search for the employee in the array
    boolean found = false;
    for (Employee e : employees) {
        if (e != null && e.getId() == id) {
            System.out.println("Employee found! Details:");
            System.out.println("Name: " + e.getName());
            System.out.println("ID: " + e.getId());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Position: " + e.getPosition());
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Employee not found.");
    }
        
    }
}

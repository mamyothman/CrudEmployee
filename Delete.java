import java.util.Scanner;

public class Delete {
    // implement function for delete Employeee
    public void deleteEmployee(Employee[] employees, Scanner scanner) {
        // Code to delete an employee from the array
        System.out.println("Enter the employee ID to delete: ");
        int id = scanner.nextInt();
        // Search for the employee in the array
        boolean found = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                // Delete the employee by setting the index to null
                employees[i] = null;
                System.out.println("Employee deleted successfully!");
                found = true;
                break;
            }
    }
}
}

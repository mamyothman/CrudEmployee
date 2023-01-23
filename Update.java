import java.util.Scanner;

public class Update {
    public void updateEmployee(Employee[] employees, Scanner scanner) {
        // Code to update an employee in the array
        System.out.println("Enter the ID of the employee you want to update: ");
        int id = scanner.nextInt();
        Employee employeeToUpdate = null;
        for (Employee e : employees) {
            if (e != null && e.getId() == id) {
                employeeToUpdate = e;
                break;
            }
        }
    
        if (employeeToUpdate != null) {
            // Employee found, prompt user for new information
            System.out.println("Enter the new name: ");
            String name = scanner.next();
            System.out.println("Enter the new salary: ");
            double salary = scanner.nextDouble();
            System.out.println("Enter the new position: ");
            String position = scanner.next();
    
            // Update the employee's information
            employeeToUpdate.setName(name);
            employeeToUpdate.setSalary(salary);
            employeeToUpdate.setPosition(position);
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Employee not found. Please try again.");
        }
       

    }
}

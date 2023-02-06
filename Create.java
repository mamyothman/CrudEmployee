import java.util.Scanner;

public class Create {
     // implement function for Create Employeee
    public void addEmployee(Employee[] employee, Scanner scanner) {
        // Code to add an employee to the array
        
            System.out.println("Enter the employee name: ");
            String name = scanner.next();
            System.out.println("Enter the employee ID: ");
            int id = scanner.nextInt();
            System.out.println("Enter the employee salary: ");
            double salary = scanner.nextDouble();
            System.out.println("Enter the employee position: ");
            String position = scanner.next();

            // EmployeeSystem employeeSystem = new EmployeeSystem();

           // Create a new Employee object with the input data
    Employee newEmployee = new Employee(name, id, position,salary);
 
    // Find the first empty index in the employees array
    int index = -1;
    for (int i = 0; i < employee.length; i++) {
        if (employee[i] == null) {
            index = i;
            break;
        }
    }

    if (index != -1) {
        // Add the new employee to the array
        employee[index] = newEmployee;
        System.out.println("Employee added successfully!");
    } else {
        System.out.println("The employee list is full. Cannot add more employees.");
    }
    
             }

        

}

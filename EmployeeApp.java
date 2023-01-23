
import java.util.Scanner;
public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store employees
        Employee[] employees = new Employee[10];
        Create create = new Create();
        Read read = new Read();
        Update update = new Update();
        Delete delete = new Delete();
        Search search = new Search();
        // Variable to store user's input
        int userInput;
    
        while (true) {
            System.out.println("Press 1 to add an employee");
            System.out.println("Press 2 to search for an employee");
            System.out.println("Press 3 to delete an employee");
            System.out.println("Press 4 to update an employee");
            System.out.println("Press 5 to read employee");
            System.out.println("Press 0 to exit");
    
            userInput = scanner.nextInt();
    
            if (userInput == 1) {
                // Add an employee
                create.addEmployee(employees ,scanner);
            } else if (userInput == 2) {
                // Search for an employee
                search.searchEmployee(employees, scanner);
            } else if (userInput == 3) {
                // Delete an employee
                delete.deleteEmployee(employees, scanner);
            } else if (userInput == 4) {
                // Update an employee
                update.updateEmployee(employees, scanner);
            } else if (userInput == 5) {
                // Update an employee
                read.readEmployee(employees,scanner);
            } else if (userInput == 0) {
                // Exit the program
                break;
                
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
    
   

    

      
}





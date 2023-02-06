import java.util.Scanner;

public class Read {
     // implement function for read Employeee
    public void readEmployee(Employee[] employees,Scanner scanner) {
        boolean isEmpty = true;
        for (Employee e : employees) {
        if (e != null) {
        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Position: " + e.getPosition());
        System.out.println("-----------------------------");
        isEmpty = false;
        }
        }
        if (isEmpty) {
        System.out.println("The employee list is empty.");
        }
        }
}

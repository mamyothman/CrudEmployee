class Employee {
private String name;
private int id;
private String position;
private double salary;

public Employee(String name, int id, String position, double salary) {
    this.name = name;
    this.id = id;
    this.position = position;
    this.salary = salary;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public  int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getPosition() {
    return position;
}

public void setPosition(String position) {
    this.position = position;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}

@Override
public String toString() {
    return "Name: " + name + "\nID: " + id + "\nPosition: " + position + "\nSalary: " + salary;
}
}
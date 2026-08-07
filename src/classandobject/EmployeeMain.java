package classandobject;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "Samarpan Karki";
        e1.salary = 30000;
        e2.name = "Mahesh Karki";
        e2.salary = 30000;
        e1.display();
        e2.display();
    }
}

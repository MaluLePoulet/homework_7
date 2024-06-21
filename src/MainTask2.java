import Person.Accountant;
import Person.Employee;
import Person.Manager;

public class MainTask2 {

    public static void main(String[] args) {

        Manager manager = new Manager(1, "Tim ", 10050.25);
        manager.printInfo();
        manager.getJobTitle();

        System.out.println("\n");

        Employee employee = new Employee(1, "Peter", 3000.50);
        employee.printInfo();
        employee.getJobTitle();

        System.out.println("\n");

        Accountant accountant = new Accountant(1, "Zina", 2500);
        accountant.printInfo();
        accountant.getJobTitle();


    }
}



package Person;

public class Employee extends Person implements JobTitleProvider {

    public Employee(int id, String name, double salary) {
        super(id, name, salary);
    }
}

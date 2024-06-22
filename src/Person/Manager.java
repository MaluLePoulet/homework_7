package Person;

public class Manager extends Person implements JobTitleProvider {

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }
}

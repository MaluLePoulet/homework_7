package Person;

public class Accountant extends Person implements JobTitleProvider {

    public Accountant(int id, String name, double salary) {
        super(id, name, salary);
    }

}


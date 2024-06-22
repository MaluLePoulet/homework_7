package Person;

public abstract class Person  {

    private int id;
    private String name;
    private double salary;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public  void printInfo (){
        System.out.println("Name: "+ name + "\nSalary: " + salary);
    }
}

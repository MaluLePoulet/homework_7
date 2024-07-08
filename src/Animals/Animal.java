package Animals;

public abstract class Animal {

    private static int nextId;
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Animal(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public void eat(String nameOfMeal) {
        System.out.println(getClass().getSimpleName() + " " + name + " ate " + nameOfMeal);
    }
    public abstract void speak();
}

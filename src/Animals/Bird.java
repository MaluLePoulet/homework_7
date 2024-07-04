package Animals;


public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public abstract void speak();

    public void fly() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is flying!");
    }

    public void buildANest() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is building a nest!");
    }
}


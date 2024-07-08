package Animals;

public abstract class Feline extends Animal {

    public Feline(String name) {
        super(name);
    }

    public abstract void speak();

    public void showClaws() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is showing claws! Be careful!");
    }

    public void purr() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is purring! It's happy!");
    }
}

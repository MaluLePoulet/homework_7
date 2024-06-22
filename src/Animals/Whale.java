package Animals;

public class Whale extends Animal implements SwimmingAnimals {

    public Whale() {
    }

    public Whale(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Whales can't speak!");
    }

    public void sing() {
        swim();
        System.out.println(getClass().getSimpleName() + " " + getName() + " is singing a song!");
    }
}

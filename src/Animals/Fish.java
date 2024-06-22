package Animals;

public class Fish extends Animal implements SwimmingAnimals {

    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Fish can't speak!");
    }

    public void forgetEverythingEveryFiveSeconds() {
        swim();
        eat("fish food");
        System.out.println(getClass().getSimpleName() + " " + getName() + " just forgot everything! ");
        eat("fish food");
    }
}

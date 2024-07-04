package Animals;

public class Cat extends Feline {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " says Meow! :3");
    }

    public void rememberAboutEgypt() {
        System.out.println("Looks like " + getClass().getSimpleName() + " " + getName() + " is thinking about something...");
        speak();
        purr();
    }
}

package Animals;

public class Raven extends Bird {

    public Raven(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " says Carr!");
    }

    public void stealSomething(String itemStolen) {
        buildANest();
        fly();
        speak();
        System.out.println(getClass().getSimpleName()  + " just stole " + itemStolen + "!");
        fly();
    }
}

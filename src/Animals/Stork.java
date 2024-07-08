package Animals;

public class Stork extends Bird {

    public Stork(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName()  + " made a cluttering sound!");
    }

    public void bringBabies() {
        System.out.println(getClass().getSimpleName() + " is bringing someone a baby!");
        fly();
        speak();
    }

}


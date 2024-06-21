package Animals;

public interface SwimmingAnimals {

    default void swim() {
        System.out.println(getClass().getSimpleName() + " is swimming!");
    }
}

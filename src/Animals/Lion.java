package Animals;

public class Lion extends Feline {

    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " says Rooar!");
    }

    public void becomeTheKingOfTheJungle() {
        speak();
        showClaws();
        System.out.println(getClass().getSimpleName() +  " became the king of the jungle!");
    }
}

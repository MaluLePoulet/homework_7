import Animals.*;
import Menu.UserAction;
import java.util.Random;
import java.util.Scanner;

public class MainAnimals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of animals: ");

        Animal[] animals = new Animal[scanner.nextInt()];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = getNextAnimal();
            System.out.println(animals[i].getClass().getSimpleName());
        }

        var actions = UserAction.values();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Select a point with action you would like animals to do: ");

        for (int i = 0; i < actions.length; i++) {
            System.out.println(actions[i].getCode() + " to " + actions[i].getDescription());
        }
        int userChoice = scanner1.nextInt();
        UserAction userAction = UserAction.valueOf(userChoice);
        if (userAction == null) {
            System.out.println("Choice is incorrect. Try again!");
        } else if (userAction == UserAction.EXIT) {

            System.out.println("Good bye!");
        }

        String userActionResult = processArray(animals, userAction);
        System.out.println(userActionResult);

        scanner.close();
        scanner1.close();
    }

    private static Animal getNextAnimal() {
        Random random = new Random();
        int randomValue = random.nextInt(6);
        if (randomValue == 0) {
            return new Cat();
        } else if (randomValue == 1) {
            return new Lion();
        } else if (randomValue == 2) {
            return new Fish();
        } else if (randomValue == 3) {
            return new Whale();
        } else if (randomValue == 4) {
            return new Raven();
        } else {
            return new Stork();
        }
    }

    private static String processArray(Animal[] animals, UserAction userAction) {
        switch (userAction) {
            case SPEAK:
                for (Animal animal : animals) {
                    animal.speak();
                }
                break;
            case EAT:
                for (Animal animal : animals) {
                    animal.eat(animal.getClass().getSimpleName() + " food");
                }
                break;
            case FLY:
                for (Animal animal : animals) {
                    if (animal instanceof Bird) {
                        ((Bird) animal).fly();
                    }
                }
                break;
            case SWIM:
                for (Animal animal : animals) {
                    if (animal instanceof SwimmingAnimals) {
                        ((SwimmingAnimals) animal).swim();
                    }
                }
                break;
            case SHOW_CLAWS:
                for (Animal animal : animals) {
                    if (animal instanceof Feline) {
                        ((Feline) animal).showClaws();
                    }
                }
                break;
            case PURR:
                for (Animal animal : animals) {
                    if (animal instanceof Feline) {
                        ((Feline) animal).purr();
                    }
                }
                break;
            case REMEMBER_ABOUT_EGYPT:
                for (Animal animal : animals) {
                    if (animal instanceof Cat) {
                        ((Cat) animal).rememberAboutEgypt();
                    }
                }
                break;
            case BECOME_THE_KING_OF_THE_JUNGLE:
                for (Animal animal : animals) {
                    if (animal instanceof Lion) {
                        ((Lion) animal).becomeTheKingOfTheJungle();
                    }
                }
                break;
            case BUILD_A_NEST:
                for (Animal animal : animals) {
                    if (animal instanceof Bird) {
                        ((Bird) animal).buildANest();
                    }
                }
                break;
            case BRING_BABIES:
                for (Animal animal : animals) {
                    if (animal instanceof Stork) {
                        ((Stork) animal).bringBabies();
                    }
                }
                break;
            case STEAL_SOMETHING:
                for (Animal animal : animals) {
                    if (animal instanceof Raven) {
                        ((Raven) animal).stealSomething("phone");
                    }
                }
                break;
            case SING:
                for (Animal animal : animals) {
                    if (animal instanceof Whale) {
                        ((Whale) animal).sing();
                    }
                }
                break;
            case FORGET_EVERYTHING_EVERY_FIVE_SECONDS:
                for (Animal animal : animals) {
                    if (animal instanceof Fish) {
                        ((Fish) animal).forgetEverythingEveryFiveSeconds();
                    }
                }
        }
        return "Goodbye!";
    }
}

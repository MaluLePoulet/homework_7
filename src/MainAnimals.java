import Animals.*;
import Menu.UserAction;
import exceptions.InvalidArraySizeException;
import exceptions.InvalidUserChoiceException;

import java.util.Scanner;

public class MainAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = null;

        while (animals == null) {
            try {
                System.out.println("Enter the number of animals: ");
                int size = scanner.nextInt();
                if (size <= 0) {
                    throw new InvalidArraySizeException("Array size must be positive.");
                }
                animals = new Animal[size];
                for (int i = 0; i < animals.length; i++) {
                    animals[i] = getNextAnimal();
                    System.out.println(animals[i].getClass().getSimpleName());
                }
            } catch (InvalidArraySizeException e) {
                System.out.println(e.getMessage());
                scanner.next();
            }
        }

        var actions = UserAction.values();
        UserAction userAction = null;
        while (userAction == null) {
            try {
                System.out.println("Select an action for the animals: ");
                for (int i = 0; i < actions.length; i++) {
                    System.out.println(actions[i].getCode() + " to " + actions[i].getDescription());
                }
                int userChoice = scanner.nextInt();
                userAction = UserAction.valueOf(userChoice);
                if (userAction == null) {
                    throw new InvalidUserChoiceException("Invalid choice. Please try again.");
                }
            } catch (InvalidUserChoiceException e) {
                System.out.println(e.getMessage());
                scanner.next();
            }
        }

        if (userAction == UserAction.EXIT) {
            System.out.println("Good bye!");
        } else {
            String userActionResult = processArray(animals, userAction);
            System.out.println(userActionResult);
        }

        scanner.close();
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

    private static Animal getNextAnimal() {
        AnimalTypes randomAnimalType = AnimalTypes.getRandomAnimalTypes();
        switch (randomAnimalType) {
            case CAT:
                return new Cat("Bublik");
            case LION:
                return new Lion("Simba");
            case FISH:
                return new Fish("Dori");
            case WHALE:
                return new Whale("White");
            case RAVEN:
                return new Raven("Edgar");
            case STORK:
                return new Stork("Pop");
        }
        return null;
    }
}
package Animals;

import java.util.Random;

public enum AnimalTypes {

    CAT,
    LION,
    FISH,
    WHALE,
    RAVEN,
    STORK;

    private static final AnimalTypes[] VALUES = values();
    private static final Random RANDOM = new Random();

    public static AnimalTypes getRandomAnimalTypes() {
        return VALUES[RANDOM.nextInt(VALUES.length)];
    }
}

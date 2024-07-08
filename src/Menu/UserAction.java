package Menu;

public enum UserAction {

    SPEAK(1, "speak"),
    EAT(2, "eat"),
    FLY(3, "fly"),
    SWIM(4, "swim"),
    SHOW_CLAWS(5, "show claws"),
    PURR(6, "purr"),
    REMEMBER_ABOUT_EGYPT(7, "remember about Egypt"),
    BECOME_THE_KING_OF_THE_JUNGLE(8, "become king of the jungle"),
    BUILD_A_NEST(9, "build a nest"),
    BRING_BABIES(10, "bring babies"),
    STEAL_SOMETHING(11, "steal something"),
    SING(12, "sing"),
    FORGET_EVERYTHING_EVERY_FIVE_SECONDS(13, "forget everything every 5 seconds"),
    EXIT(14, "exit");

    private int code;

    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    UserAction(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static UserAction valueOf (int code) {
        UserAction[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].code == code)
                return values [i];

        }
        return null;
    }
}

package exceptions;

public class InvalidUserChoiceException extends Exception {
    public InvalidUserChoiceException() {
        super();
    }

    public InvalidUserChoiceException(String message) {
        super(message);
    }
}

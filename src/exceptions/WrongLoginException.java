package exceptions;

public class WrongLoginException extends ValidationException {
    public WrongLoginException(String message) {
        super(message);
    }
}
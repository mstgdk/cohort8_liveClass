package week8.exceptions.custom;

public class InvalidNameException extends RuntimeException{
    public InvalidNameException(String message) {
        super(message);
    }
}

package week8.exceptions.custom;

//checked Custom Exc
public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}

package mk.ukim.finki.uiktp.plantpalace.model.exceptions;

public class InvalidUserCredentialsException extends RuntimeException{
    public InvalidUserCredentialsException()
    {
        super("Invalid User credentials exception");
    }
}

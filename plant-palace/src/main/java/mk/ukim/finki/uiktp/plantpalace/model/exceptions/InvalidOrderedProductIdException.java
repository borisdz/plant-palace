package mk.ukim.finki.uiktp.plantpalace.model.exceptions;

public class InvalidOrderedProductIdException extends RuntimeException{
    public InvalidOrderedProductIdException() {
        super("No ordered product with that Id.");
    }
}

package ch18_exception.exam;
public class PayException extends Exception {
    
    public PayException() {
    }

    public PayException(String message){
        super(message);
    }
}
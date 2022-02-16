package ch18_exception.exam;
public class PriceException extends Exception {
    public PriceException() {
        super();
    }
    public PriceException(String msg) {
        super(msg);
    }
}
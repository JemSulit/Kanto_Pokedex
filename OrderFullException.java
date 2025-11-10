public class OrderFullException extends RuntimeException {
    public OrderFullException(String message) {
        super(message);
    }
    
    public OrderFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
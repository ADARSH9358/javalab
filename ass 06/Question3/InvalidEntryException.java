public class InvalidEntryException extends Exception {
    public InvalidEntryException(String message, Throwable cause) {
        super(message, cause);
    }

    public String toString() {
        return "InvalidEntryException: " + getMessage() + " caused by " + getCause();
    }
}

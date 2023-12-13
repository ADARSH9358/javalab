public class InvalidEntryException extends RuntimeException {
    public InvalidEntryException(String message, Throwable cause) {
        super(message, cause);
    }

    public String toString() {
        return "InvalidEntryException: " + getMessage() + " caused by " + getCause();
    }
}

/*
 * If we convert this into an unchecked exception It will work just fine. No
 * Specific Changes need to be made. Although this time we can do away with
 * handling the error and leave it for the JRE.
 */

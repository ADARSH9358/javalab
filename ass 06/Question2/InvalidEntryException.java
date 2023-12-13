public class InvalidEntryException extends Exception {
    public InvalidEntryException(String message) {
        super(message);
    }

    public String toString() {
        return "InvalidEntryException: " + this.getMessage();
    }
}

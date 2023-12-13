public class InvalidEntryException extends Exception {
    public InvalidEntryException(String message) {
        super(message);
    }

    public String toString() {
        return "InvalidEntryException: " + this.getMessage();
    }
    // public String getMessage() {
    // Override getMessage() to return only the custom message
    //     return super.getMessage()+"yes";
    // }
    
}

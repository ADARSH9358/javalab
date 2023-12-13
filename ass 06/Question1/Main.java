public class Main {
    public static void main(String[] args) {
        try {
            throw new InvalidEntryException("This is an invalid entry.");
        } catch (InvalidEntryException e) {
            System.out.println(e.getMessage());
            // System.out.println(e);
            System.out.println(e.toString());
        }
    }

}
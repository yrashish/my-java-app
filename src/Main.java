public class Main {
    public static void main(String[] args) {
        String message = null;
        printMessageLength(message);
    }
    private static void printMessageLength(String message) {
        int length = message.length();
        System.out.println("Length of the message: " + length);
    }
}
public class Main {
    public static void main(String[] args) {

        String message = null;//to fix NullPointerException comment this line
        //and uncomment this line
       // String message = "Hello, Docker!";/
        printMessageLength(message);
    }
    private static void printMessageLength(String message) {
        int length = message.length();
        System.out.println("Length of the message: " + length);
    }
}
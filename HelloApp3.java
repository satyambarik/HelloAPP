public class HelloApp3{
    public static void main(String[] args) {

        String message;

        // If no names are provided
        if (args.length == 0) {
            message = "World";
        } else {
            // Join all names with comma and space
            message = String.join(", ", args);
        }

        // Single greeting
        System.out.println("Hello, " + message + "!");
    }
}


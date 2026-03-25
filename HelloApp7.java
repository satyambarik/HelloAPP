public class HelloApp7 {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Join all names using comma delimiter
            String names = String.join(", ", args);
            System.out.println("Hello " + names);
        }
    }
    
}

public class HelloApp6 {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            String names = "";

            // Enhanced for loop to combine names
            for (String name : args) {
                names += name + ", ";
            }

            // Remove the trailing comma and space
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello " + names);
        }
    }
}
    


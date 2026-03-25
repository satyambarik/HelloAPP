public class HelloApp2 {

    public static void main(String[] args) {
        
        // Assign name based on whether argument is provided
        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}

package HELLOAPP;

public class uc2 {
    public static void main(String[]args){
        // Check if at least one argument is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("No name provided. Please run like:");
            System.out.println("java HelloApp John");
        
        }
    }
}

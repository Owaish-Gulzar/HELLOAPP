package HELLOAPP;
import java.util.*;
public class uc3 {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name");
         String s = sc.nextLine();
        if(s.isEmpty())
        {
            System.out.println("hello world");
        }
        else{
            System.out.println("hello"+" "+s);
        }
    }
}

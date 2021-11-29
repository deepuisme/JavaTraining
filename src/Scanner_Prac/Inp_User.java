package Scanner_Prac;

import java.util.Scanner;

public class Inp_User {
    public static void main(String[] args) {
        System.out.println("Enter your Password.");
        // user input
        Scanner pass = new Scanner(System.in);
        String check = pass.nextLine();

        if (check.equals("Java")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Re-Enter");
        }


    }
}

package FileWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        try {
            System.out.println("Enter Text");

            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            FileWriter fileWrite = new FileWriter("output.txt");
            fileWrite.write(text);
            fileWrite.close();
        } catch (IOException e) {
            System.out.println("Exception Catch");
        }
    }
}

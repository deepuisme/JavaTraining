package ModelOne.FileRead;

import java.io.FileReader;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("E:\\2. Java Training Dearwalk\\src\\FileReadWrite\\name");
            int i;
            while ((i=fileReader.read())!=-1){
                System.out.println((char)i );
            }
        }
        catch (IOException e){
            System.out.println("Exception Caught");
        }
    }
}

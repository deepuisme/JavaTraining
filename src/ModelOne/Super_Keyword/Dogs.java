package ModelOne.Super_Keyword;

public class Dogs extends Animals {
    String color = "White";
    void display(){
        System.out.println("Derived Class" + color);
        System.out.println("Parent Class" + super.color);
    }
}

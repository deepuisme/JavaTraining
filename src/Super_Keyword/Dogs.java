package Super_Keyword;

import Inheritance.Animal;

public class Dogs extends Animals {
    String color = "White";
    void display(){
        System.out.println("Derived Class" + color);
        System.out.println("Parent Class" + super.color);
    }
}

package Static_Var;

import javax.sound.midi.Soundbank;

public class Sta_Var {
    // instance variable
    int id;
    String name;
    static String college = "DWIT";

    // constructor
    public Sta_Var (int id, String name){
        this.id = id;
        this.name = name;
    }
    public static String change(){
        college = "Nepal College";
        return college;
    }
    void display(){
        System.out.println("Stu name " + name + " " + "Stu Id " + id + " " + "College " + college);
    }
}

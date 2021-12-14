package ModelOne.Static_Var;

public class Sta_Out {
    public static void main(String[] args) {
       Sta_Var num = new Sta_Var(6,"Deepu");
        num.display();
        String cha = Sta_Var.change();
        System.out.println(cha);
    }
}

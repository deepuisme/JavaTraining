package ModelOne.Constructor;

public class ParaCons {
    //Instance var
    public int id;
    public String name;

    //ModelOne.Constructor
    public ParaCons(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Id is: " + id + " " + "Name is: " + name);

    }

    public static void main(String[] args) {
        ParaCons paraCons = new ParaCons(121, "java");
    }
}

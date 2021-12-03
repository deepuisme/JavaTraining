package SuperCons;

public class Employee extends Person {
    float salary;

    public Employee(String name, int id, float salary) {
        super(name, id);
        this.salary = salary;

    }
    public void display(){
        System.out.println("Name is : " + name + " " + " " + "ID : " +  " " + id + " " + "Salary " + " " + salary);
    }
}

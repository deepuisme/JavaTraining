package JavaBEaen;

import java.io.Serializable;

public class JavaBeanEXa implements Serializable {
    private String bankName;
    private int id;

    public JavaBeanEXa() {
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        JavaBeanEXa b = new JavaBeanEXa();
        b.setBankName("SUNRISE");
        b.setId(12);
        System.out.println("Name" + " " + b.getBankName() + " " + "ID" + " " + b.getId());
    }
}

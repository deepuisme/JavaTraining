package Desision_Making.desision_making_switch;

public class swi_cond {
    public void sitw() {
        String marks = "B";
        switch (marks) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                ;
                System.out.println("Good");
                break;
            case "C":
                ;
                System.out.println("Fair");
                break;
            default:
                System.out.println("failed");
        }
    }
}

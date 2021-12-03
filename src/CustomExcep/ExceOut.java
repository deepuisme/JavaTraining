package CustomExcep;

public class ExceOut {
    public static void main(String[] args) {
       try{
           AgeExce out = new AgeExce();
           out.age(2);
       }
       catch (InvalidAgeException e){
           e.printStackTrace();
       }
    }
}

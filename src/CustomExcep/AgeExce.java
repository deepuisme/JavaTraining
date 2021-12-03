package CustomExcep;

public class AgeExce {
    public void age(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Cannot Vote####");
        }
        else {
            System.out.println("Can Vote!!!!");
        }
    }
}

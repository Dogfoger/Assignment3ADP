package trainor.sean;

public class Deer extends Animal implements Vegetarian {

    @Override
    public String amVeg() {
        String output = "I am a Vegetarian!";
        return output;
    }

    public String amDeer() {
        String output = "I am a deer!";
        return output;
    }
}

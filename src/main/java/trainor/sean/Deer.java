package trainor.sean;

public class Deer extends Animal implements Vegetarian {

    @Override
    public void amVeg() {
        System.out.println("I am a vegetarian!");
    }

    public void amDeer() {
        System.out.println("I am a deer!");
    }
}

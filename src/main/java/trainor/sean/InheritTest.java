package trainor.sean;

public class InheritTest extends Encap {

    //inheritance proof

    public InheritTest() {
    }

    public InheritTest(String name, int age, int studentNum) {
        super(name, age, studentNum);
    }

    public String printName (String name2) {
        setName(name2);
        return getName();

    }
}

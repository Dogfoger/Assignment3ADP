package trainor.sean;

public class InheritTest extends Encap {

    //inheritance proof

    public InheritTest() {
    }

    public InheritTest(String name, int age, int studentNum) {
        super(name, age, studentNum);
    }

    public String printName () {
        setName("Sean");
        return getName();

    }
}

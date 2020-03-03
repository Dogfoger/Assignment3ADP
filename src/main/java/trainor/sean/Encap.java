package trainor.sean;

public class Encap {

    //encapsulation proof

    private String name;
    private int age, studentNum;

    public Encap() {

    }

    public Encap(String name, int age, int studentNum) {
        this.name = name;
        this.age = age;
        this.studentNum = studentNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentNum() {
        return studentNum;
    }
}

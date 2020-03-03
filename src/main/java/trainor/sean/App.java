package trainor.sean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //inheritance and encapsulation
        InheritTest i = new InheritTest();

        String printThis = i.printName();

        System.out.println(printThis);

        //polymorphism
        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = d;
        Object o = d;

        System.out.println(d.amAnimal()); //amAnimal from Animal class
        System.out.println(d.amVeg()); // amVeg from Vegetarian class
        System.out.println(d.amDeer()); //amDeer from Deer class

        //Composition alternative to inheritance
        Employee e = new Employee();

        System.out.println("Employee wage = " + e.getWage());

    }

}

package trainor.sean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void polymorphismTest()
    {
        Deer d = new Deer();

        String output1 = d.amDeer();
        String output2 = d.amVeg();
        String output3 = d.amAnimal();

        assertEquals("I am a deer!", output1);
        assertEquals("I am a Vegetarian!", output2);
        assertEquals("I am an animal!", output3);
    }

    @Test
    public void inheritanceTest()
    {
        InheritTest i = new InheritTest();

        assertEquals("Sean", i.printName());
    }

    @Test
    public void compositionTest() {
        Employee e = new Employee();

        assertEquals(1000, e.getWage());

    }
}

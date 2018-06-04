import static org.junit.Assert.*;

public class NumbersTest {


    public void sum() throws Exception{
            Numbers numbers = new Numbers();
            int actual = numbers.sum(5);
            int expected = 15;
            }

    @org.junit.After
    public void tearDown() throws Exception {
    }

}
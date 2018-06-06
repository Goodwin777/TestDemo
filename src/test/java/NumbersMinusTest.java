import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersMinusTest {

    @Test
    public void result() {
        NumbersMinus numbersMinus = new NumbersMinus();
        int actual = numbersMinus.result(1, 2);
        int expected = -1;
        assertEquals(actual, expected);

    }

    @Test
    public void result_reverse() {
        NumbersMinus numbersMinus = new NumbersMinus();
        int actual = NumbersMinus.res2(1, 1);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
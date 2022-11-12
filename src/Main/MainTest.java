package src.Main;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    Main main = new Main();
    @Test
    public void sortNumbersTest() {
        //given (arrange):
        String[] input = new String[] {"1", "5", "15", "9", "4"};
        String[] expected = new String[] {"1", "5", "15", "9", "4"};
        //when (act):
        String[] actual = main.sortNumbers(input);
        //then(assert):
        Assert.assertArrayEquals(expected, actual);
    }
}

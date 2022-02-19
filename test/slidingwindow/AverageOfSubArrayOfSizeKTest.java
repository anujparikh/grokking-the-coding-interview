package slidingwindow;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AverageOfSubArrayOfSizeKTest {

    @Test
    public void simpleTest() {
        double[] result = AverageOfSubArrayOfSizeK.findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        System.out.println(Arrays.toString(result));
    }
}

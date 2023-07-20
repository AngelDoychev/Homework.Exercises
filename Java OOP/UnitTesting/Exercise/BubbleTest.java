package UnitTestingExercise.p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

public class BubbleTest {
    private final static int[] NUMBERS = {73, 12, 3, 4, 5};
    private final static int[] SORTED_ARRAY = {3, 4, 5, 12, 73};

    @Test
    public void testIfArrIsSorted() {
        int[] unsortedArr = NUMBERS;
        Bubble.sort(unsortedArr);
        Assert.assertArrayEquals(SORTED_ARRAY, unsortedArr);
    }
}
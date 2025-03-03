package mate.academy;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class RevealCardsTest {
    private static final Map<int[], int[]> data = new LinkedHashMap<>();

    @BeforeClass
    public static void setup() {
        data.put(new int[]{17, 13, 11, 2, 3, 5, 7}, new int[]{2, 13, 3, 11, 5, 17, 7});
        data.put(new int[]{1, 1000}, new int[]{1, 1000});
        data.put(new int[]{2, 3, 5}, new int[]{2, 5, 3});
        data.put(new int[]{6, 4, 2}, new int[]{2, 6, 4});
        data.put(new int[]{1, 2, 3, 4, 5}, new int[]{1, 5, 2, 4, 3});
        data.put(new int[]{8, 1, 7}, new int[]{1, 8, 7});
    }

    @Test
    public void testDeckRevealedIncreasing() {
        for (Map.Entry<int[], int[]> entry : data.entrySet()) {
            int[] input = entry.getKey();
            int[] expected = entry.getValue();
            int[] actual = RevealCards.deckRevealedIncreasing(input);
            Assert.assertArrayEquals("The method did not return the expected result for the input: " + Arrays.toString(input),
                    expected, actual);
        }
    }
}

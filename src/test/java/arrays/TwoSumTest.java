package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ikiselev 08.11.2023
 */
public class TwoSumTest {

    TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void findIndexesTest() {
        assertEquals(Arrays.toString(twoSum.findIndexes(new int[] {1, 2, 3, 4, 5}, 6)),
                Arrays.toString(new int[] {0, 4}));
        assertEquals(Arrays.toString(twoSum.findIndexes(new int[] {2, 7, 11, 15}, 9)),
                Arrays.toString(new int[] {0, 1}));
        assertEquals(Arrays.toString(twoSum.findIndexes(new int[] {3, 2, 4}, 6)),
                Arrays.toString(new int[] {1, 2}));
        assertEquals(Arrays.toString(twoSum.findIndexes(new int[] {3, 3}, 6)),
                Arrays.toString(new int[] {0, 1}));
        assertEquals(Arrays.toString(twoSum.findIndexes(new int[] {1, 2, 3}, 7)),
                Arrays.toString(new int[] {-1, -1}));
    }

}

package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ikiselev 20.10.2023
 */
public class SquaresSortedArrayTest {

    SquaresSortedArray sortedArray;

    @BeforeEach
    void setUp() {
        sortedArray = new SquaresSortedArray();
    }

    @Test
    void sortedSquaresTest() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] output = sortedArray.sortedSquares(input);
        assertEquals(Arrays.toString(output), Arrays.toString(new int[] {0, 1, 9, 16, 100}));
    }
}

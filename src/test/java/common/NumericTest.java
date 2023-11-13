package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ikiselev 13.11.2023
 */
public class NumericTest {

    Numeric numeric = new Numeric();

    @Test
    void reverseTest() {
        assertEquals(321, numeric.reverse(123));
        assertEquals(-321, numeric.reverse(-123));
        assertEquals(21, numeric.reverse(120));
        assertEquals(1, numeric.reverse(10));
    }

}

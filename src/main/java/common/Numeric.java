package common;

/**
 * Учитывая 32-битное целое число со знаком x, верните x его цифры в обратном порядке.
 * Если при реверсировании x значение выходит за пределы диапазона 32-битных целых чисел со знаком,
 * верните значение [-2^31, 2^31 - 1] = 0
 *
 * @author ikiselev 13.11.2023
 */
public class Numeric {

    public int reverse(int x) {
        int p = x;
        int rev = 0;
        while (p != 0) {
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && p % 10 > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && p % 10 < -8)) return 0;
            rev = rev * 10 + p % 10;
            p = p / 10;
        }
        return rev;
    }
}

package common;

/**
 * @author ikiselev 13.11.2023
 *
 * Учитывая целое число x, верните true если x палиндром и иначе - false
 *
 * Пример 1:
 * Входные данные: x = 121
 * Выходные данные: true
 *
 * Пример 2:
 * Ввод: x = -121
 * Вывод: ложь
 *
 * Пример 3:
 * Ввод: x = 10
 * Вывод: ложь
 */
public class Palindrome {

    /**
     * Решение #1 (создание revers-числа)
     */
    public boolean isPalindrome1(int x) {
        if (x == 0) return true;
        if (x < 0) return false;
        int p = x;
        int reverse = 0;
        while (p != 0) {
            reverse = reverse * 10 + p % 10;
            p = p / 10;
        }
        return reverse == x;
    }

}

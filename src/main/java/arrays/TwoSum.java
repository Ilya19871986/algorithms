package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел так, чтобы их сумма составляла target.
 * Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
 * Вы можете вернуть ответ в любом порядке.
 *
 * Пример 1:
 * Ввод: nums = [2,7,11,15], target = 9
 * Выход: [0,1]
 * Объяснение: поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
 *
 * Пример 2:
 * Ввод: nums = [3,2,4], цель = 6
 * Вывод: [1,2]
 *
 * Пример 3:
 * Ввод: nums = [3,3], цель = 6
 * Вывод: [0,1]
 */
public class TwoSum {

    /**
     * Решение #1 (перебор)
     * Временная сложность O(n^2)
     * Память O(1)
     */
    public int[] findIndexes(int[] nums, int target) {
        int j;
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            while(j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                } else {
                    j++;
                }
            }
        }
        return new int[] {-1, -1};
    }

    /**
     * Решение #2 (hashmap)
     * Временная сложность O(n)
     * Память O(1)
     */
    public int[] findIndexes2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x) && map.get(x) != i) {
                return new int[] {i, map.get(x)};
            }
        }
        return new int[] {-1, -1};
    }

}

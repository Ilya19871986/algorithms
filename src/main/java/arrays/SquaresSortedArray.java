package arrays;

/**
 * Получить отсортированный массив квадратов из входящего отсортированного массива
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 */
public class SquaresSortedArray {

    public int[] sortedSquares(int []arr) {
        int[] result = new int[arr.length];
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            // сравниваем по модулю и максимальный пишем в конец результирующего массива
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[p] = arr[i] * arr[i];
                i++;
            } else {
                result[p] = arr[j] * arr[j];
                j--;
            }
        }
        return result;
    }

}

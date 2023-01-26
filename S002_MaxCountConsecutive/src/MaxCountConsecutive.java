/*
Дан массив двоичных чисел, например, [1, 1, 0, 1, 1, 1].
Вывести максимальное количество подряд идущих 1.
 */
public class MaxCountConsecutive {
    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1};
        int count, countMax;
        count = countMax = array[0];
        int size = array.length - 1;
        for (int i = 1; i < size; i++) {
            if (array[i] == 1) {
                count++;
            } else if (array[i - 1] == 1) {
                if (countMax < count) countMax = count;
                count = 0;
            }
        }
        if (array[size] == 1 && countMax < ++count) countMax = count;

        for (int item: array) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        System.out.printf("countMax(1) = %d", countMax);

        // 0 1 1 1 0 1 0 0 1 1 0 1 1 1 1
        // countMax(1) = 4
    }
}

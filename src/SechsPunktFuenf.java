import java.util.Arrays;

public class SechsPunktFuenf {
    public static void main(String[] args) {
        int[] array = {10, 5, 46, 3, 15};
        System.out.println(Arrays.toString(array));
        sort(array);
        String sorted = Arrays.toString(array);
        System.out.println(sorted);
    }

    public static int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            String sorted = Arrays.toString(array);
            System.out.println(sorted);
        }
        return array;
    }
}
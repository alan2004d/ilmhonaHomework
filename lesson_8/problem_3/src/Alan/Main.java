package Alan;

public class Main {

    public static void main(String[] args) {
        int[] array = {6, 3, 9, 5, -9, -2, 1, 5, 6, 3};
        maxInArray(array);
        int max = maxInArray(array);
        System.out.println(max);

    }

    public static int maxInArray(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;

    }
}
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 13, 1, 0};


        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);
    }
}
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {27,109,297,59,8};

        array[0] = array[array.length/2];
        array[array.length-1] = array[array.length/2];
        System.out.println(Arrays.toString(array));
    }
}
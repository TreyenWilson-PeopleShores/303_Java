import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {27,109,297,59,8};

        System.out.println("First Loop:");
        for (int x = 0; x<array.length-1;x++){
            System.out.println(array[x]);
            // Misses the 5th value
        }
        System.out.println("Second Loop:");
        for (int x = 0; x<array.length;x++){
            System.out.println(array[x]);
            // Gets the 5th value
        }
        System.out.println("Third Part:");
        array[5] = 2;
        // Doesn't work, since the index should be at 4
        // Would work at [4]

    }
}
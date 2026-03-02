import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {27,109,297,59,8};

        System.out.println("First Loop:");
        for (int x = 0; x<array.length;x++){
            array[x] = x;
            System.out.println(array[x]);
        }


    }
}
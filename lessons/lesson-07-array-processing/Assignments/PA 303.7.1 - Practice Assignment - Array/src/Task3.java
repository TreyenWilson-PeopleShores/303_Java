import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"red", "green", "blue", "yellow"};


        //System.out.println(array[(array.length/2)]);
        String[] arrayCopy = array.clone();
        System.out.println(Arrays.toString(arrayCopy));
    }
}
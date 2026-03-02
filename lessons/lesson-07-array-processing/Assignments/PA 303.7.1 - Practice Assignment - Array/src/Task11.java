import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        //ArrayList<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //String userName = scanner.nextLine();

        System.out.println("How many favorite things do you have?");
        int things = scanner.nextInt();

        String[] array1 = new String[things+1];
        for (int x = 0; x<array1.length; x++){
            //System.out.println("Item: ");
            array1[x] = scanner.nextLine();
        }

        for(String y : array1){
            System.out.println(y);
        }
    }
}
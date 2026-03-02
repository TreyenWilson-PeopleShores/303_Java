import java.util.Scanner;  // Import the Scanner class

public class TaskThree {
    public static void main(String[] args) {
        int currentTuition = 10000;
        int years = 0;
        double x = currentTuition;
        while (x<20000){
            x=x+x*.07;
            years++;
            //System.out.println(x);
        }

        System.out.println("At $10k for the initial tuition it will take: ");
        System.out.println(years);
    }
}
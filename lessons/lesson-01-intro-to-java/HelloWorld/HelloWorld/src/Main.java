import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("My name is W!");
        double num = 12.3;
        //new Scanner(Syetem.in)
        System.out.println(num);
        int tempNum = (int) num;
        if(num>=tempNum+.5){
            num+=1;
            System.out.println("Rounded up:");
            System.out.println((int) num);
        } else if(num<tempNum+.5){
            System.out.println("Rounded down:");
            System.out.println(tempNum);
        }
    }
}
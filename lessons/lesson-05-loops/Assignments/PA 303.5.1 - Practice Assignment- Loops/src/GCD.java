import java.util.Scanner;  // Import the Scanner class



public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1: ");
        int n1 = scanner.nextInt();

        System.out.println("Input 2: ");
        int n2 = scanner.nextInt();
        int gcn = 1;
        if(n1<n2){
            for (int x = n1; x>1; x--){
                if (n1%x==0 && n2%x==0){
                    gcn = x;
                    break;
                }
            }
        }else{
            for (int x = n2; x>1; x--){
                if (n1%x==0 && n2%x==0){
                    gcn = x;
                    break;
                }
            }
        }
    System.out.println("Greatest Common Divisor: ");
        System.out.println(gcn);
    }
}
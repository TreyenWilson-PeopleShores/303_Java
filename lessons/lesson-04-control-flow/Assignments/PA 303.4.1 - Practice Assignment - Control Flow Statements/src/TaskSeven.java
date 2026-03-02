import java.util.Scanner; // Import the Scanner class

public class TaskSeven {
    public static void main(String[] args) {


        // Task 7
        System.out.println("Task 7: ");
        Scanner scanner = new Scanner(System.in);
        //Income
        System.out.println("Your Income:");
        int inputIncome = scanner.nextInt();

        //Status
        System.out.println("Your Status:");
        String inputStatus = scanner.next();
        System.out.println(inputIncome);
        System.out.println(inputStatus);




        if(inputStatus.toUpperCase().equals("SINGLE")){
            if (inputIncome >= 372951) {
                System.out.println("Tax to be paid: "+inputIncome*.35);
            } else if (inputIncome >= 171551) {
                System.out.println("Tax to be paid: "+inputIncome*.33);
            } else if (inputIncome >= 82251) {
                System.out.println("Tax to be paid: "+inputIncome*.28);
            } else if (inputIncome >= 33951) {
                System.out.println("Tax to be paid: "+inputIncome*.25);
            } else if (inputIncome >= 8351) {
                System.out.println("Tax to be paid: "+inputIncome*.15);
            } else if (inputIncome >= 0) {
                System.out.println("Tax to be paid: "+inputIncome*.10);
            }
        } else if(inputStatus.toUpperCase().equals("MARRIED FILING JOINTLY")){
            if (inputIncome >= 372951) {
                System.out.println("Tax to be paid: "+inputIncome*.35);
            } else if (inputIncome >= 208851) {
                System.out.println("Tax to be paid: "+inputIncome*.33);
            } else if (inputIncome >= 137051) {
                System.out.println("Tax to be paid: "+inputIncome*.28);
            } else if (inputIncome >= 67901) {
                System.out.println("Tax to be paid: "+inputIncome*.25);
            } else if (inputIncome >= 16701) {
                System.out.println("Tax to be paid: "+inputIncome*.15);
            } else if (inputIncome >= 0) {
                System.out.println("Tax to be paid: "+inputIncome*.10);
            }
        } else if(inputStatus.toUpperCase().equals("MARRIED FILING SEPARATELY")){
            if (inputIncome >= 186476) {
                System.out.println("Tax to be paid: "+inputIncome*.35);
            } else if (inputIncome >= 104426) {
                System.out.println("Tax to be paid: "+inputIncome*.33);
            } else if (inputIncome >= 68526) {
                System.out.println("Tax to be paid: "+inputIncome*.28);
            } else if (inputIncome >= 33951) {
                System.out.println("Tax to be paid: "+inputIncome*.25);
            } else if (inputIncome >= 8351) {
                System.out.println("Tax to be paid: "+inputIncome*.15);
            } else if (inputIncome >= 0) {
                System.out.println("Tax to be paid: "+inputIncome*.10);
            }
        } else if(inputStatus.toUpperCase().equals("HEAD OF HOUSEHOLD")){
            if (inputIncome >= 372951) {
                System.out.println("Tax to be paid: "+inputIncome*.35);
            } else if (inputIncome >= 190201) {
                System.out.println("Tax to be paid: "+inputIncome*.33);
            } else if (inputIncome >= 117451) {
                System.out.println("Tax to be paid: "+inputIncome*.28);
            } else if (inputIncome >= 45501) {
                System.out.println("Tax to be paid: "+inputIncome*.25);
            } else if (inputIncome >= 11951) {
                System.out.println("Tax to be paid: "+inputIncome*.15);
            } else if (inputIncome >= 0) {
                System.out.println("Tax to be paid: "+inputIncome*.10);
            }
        }
    }

}

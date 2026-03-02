import java.util.Scanner; // Import the Scanner class

public class Task1 {
    public static void main(String[] args){
        // Task 1
        int x = 7;
        System.out.println("Task 1: ");
        if (x<10){
            x = 7;
            System.out.println(x);
            //I'm not sure if it wants to print or not.
            //It says to print the result, but also
            //that the console shouldn't display
            //anything...
        }

        // Task 2
        System.out.println("Task 2: ");
        x = 7; // Setting x back to 7.
        if (x<10){
            System.out.println("Less than 10");
            x = 15;
        } else{
            System.out.println("Less than 10");
        }

        // Task 3
        System.out.println("Task 3: ");
        x = 15; // Setting x to 15.
        if (x<10){
            System.out.println("Less than 10");
            x = 50;
            x = 15;
        } else if(x>10 && x<20){
            System.out.println("Between 10 and 20");
            x = 50;
        }else if(x>=20){
            System.out.println("Greater than or equal to 20");
            x = 50;
        }


        // Task 4
        System.out.println("Task 4: ");
        x = 15; // Setting x to 15.
        if (x<10 || x>20){
            System.out.println("Out of range");
            x = 5;
        } else if(x>10 && x<20){
            System.out.println("In range");
            x = 5;
        }


        // Task 5
        System.out.println("Task 5: ");
        // Default input
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input>89){
            System.out.println("A");
        } else if(input>79){
            System.out.println("B");
        } else if(input>69){
            System.out.println("C");
        } else if(input>59){
            System.out.println("D");
        } else if(input<60){
            System.out.println("F");
        }

        System.out.println("Task 6: ");
        // Default input
        //Scanner scanner = new Scanner(System.in);
        // Using the declared one from above.
        int inputTwo = scanner.nextInt();
        String dayName = "";
        switch (inputTwo) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Out of range";
        }
        System.out.println(dayName);


    }

}

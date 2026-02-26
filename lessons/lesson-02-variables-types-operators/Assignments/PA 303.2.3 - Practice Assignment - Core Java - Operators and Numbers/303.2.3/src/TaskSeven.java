public class TaskSeven {
    public static void main(String[] args) {

        // Task 7
        int x; int y;
        x = 5; y = 8;
        int sum = ++x+y;
        System.out.println("++X+Y : " + (sum));
        sum = y+x++;
        System.out.println("Y+X++ : " + (sum));

    }
}

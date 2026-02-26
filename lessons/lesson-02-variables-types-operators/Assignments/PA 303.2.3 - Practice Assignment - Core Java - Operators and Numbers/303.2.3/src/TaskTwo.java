public class TaskTwo {
    public static void main(String[] args) {

        int x = 150;
        System.out.println("Binary X: " + (Integer.toBinaryString(x)));
        x = x >> 2; // The binary should have an additional 1 at the end, and the decimal should increase
        System.out.println("After ByteShift for X: " + (x));

        int a = 225;
        System.out.println("Binary A: " + (Integer.toBinaryString(a)));
        a = a >> 2;
        System.out.println("After ByteShift for A: " + (a));
        int b = 1555;
        System.out.println("Binary B: " + (Integer.toBinaryString(b)));
        b = b >> 2;
        System.out.println("After ByteShift for B: " + (b));
        int c = 32456;
        System.out.println("Binary C: " + (Integer.toBinaryString(c)));
        c = c >> 2;
        System.out.println("After ByteShift for C: " + (c));

    }
}

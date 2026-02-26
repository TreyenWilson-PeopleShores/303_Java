public class OperatorsNumbers {
    public static void main(String[] args) {

        int x = 2;
        System.out.println("Binary X: " + (Integer.toBinaryString(x)));
        x = x << 1; // The value should be 9 for binary, and 0 for decimal
        System.out.println("After ByteShift for X: " +(x));

        int a = 9;
        System.out.println("Binary A: " + (Integer.toBinaryString(a)));
        a = a << 1;
        System.out.println("After ByteShift for A: " +(a));
        int b = 17;
        System.out.println("Binary B: " + (Integer.toBinaryString(b)));
        b = b << 1;
        System.out.println("After ByteShift for B: " +(b));
        int c = 88;
        System.out.println("Binary C: " + (Integer.toBinaryString(c)));
        c = c << 1;
        System.out.println("After ByteShift for C: " +(c));

    }
}
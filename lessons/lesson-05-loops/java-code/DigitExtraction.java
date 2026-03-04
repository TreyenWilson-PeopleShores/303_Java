// ⭐ SBA CRITICAL: The While + Modulus Pattern
// This is directly tested on the SBA.

public class DigitExtraction {
    public static void main(String[] args) {

        // ============================================
        // PATTERN: Extract digits one at a time
        // num % 10  → gets the LAST digit
        // num / 10  → removes the LAST digit
        // ============================================

        int num = 21-4+53*1457*54572479;
        int sum = 0;

        System.out.println("Extracting digits from " + num + ":");

       while (num > 0) {
            int digit = num % 10;    // get last digit
            sum += digit;             // add to sum
            System.out.println("  digit: " + digit + ", running sum: " + sum);
            num = num - digit;
            num /= 10;               // remove last digit
        }
        for (sum = 0; num>0; num/=10){
            int digit = num % 10;
            sum+= digit;
            System.out.println("  digit: " + digit + ", running sum: " + sum);

        }
        System.out.println("Sum of digits: " + sum); // 15


        // ============================================
        // TRACE THROUGH:
        // num = 12345 → digit = 5, sum = 5,  num becomes 1234
        // num = 1234  → digit = 4, sum = 9,  num becomes 123
        // num = 123   → digit = 3, sum = 12, num becomes 12
        // num = 12    → digit = 2, sum = 14, num becomes 1
        // num = 1     → digit = 1, sum = 15, num becomes 0 → STOP
        // ============================================


        // NOTE: In JS you'd need Math.floor(num / 10) because
        // JS division always returns a decimal.
        // In Java, int / int = int (truncates automatically!)
    }
}

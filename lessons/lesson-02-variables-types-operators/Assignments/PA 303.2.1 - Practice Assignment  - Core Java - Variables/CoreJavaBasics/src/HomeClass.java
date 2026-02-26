import java.text.DecimalFormat;


public class HomeClass {

  public static void main(String[] args) {
    // Code for sum of ints below
    int int1 = 2; int int2 = 8;
    int intSum = int1+int2;
    System.out.println("Int Sum: "+(intSum));

    // Code for sum of doubles below
    double double1 = 5.3; double double2 = 3.8;
    double doubleSum = double1+double2;
    System.out.println("Double Sum: "+(doubleSum));

    // Code for sum of int+double below
    // Reusing int1 and double1 for the variables here
    double doubleIntSum = int1+double1; // Sum has to be double since the result will be a double
    System.out.println("Int-Double Sum: "+(doubleIntSum));

    // Code for division of ints below
    // Reusing int1 and int2 for the variables here
    double dividedInt = int2/int1; //Making it a double since division can easily cause decimal numbers
    System.out.println("Divided Int: "+(dividedInt));
    //int2 = 8.1; (commented out as to not cause an error) // Assigning the larger int to a decimal causes it to error out, as it needs to be a double.
    // The number either has to be a double from a start, or a new variable with double has to be declared with it

    // Code for division of doubles below
    // Reusing double2 and double1 for the variables here
    double dividedDouble = double1/double2;
    System.out.println("Divided Double: "+(dividedDouble));
    //int doubleDivideInt = dividedDouble; Commented out to not cause an error in the terminal
    //System.out.println(doubleDivideInt); Commented out to not cause an error in the terminal


    // Code for x,y, and q code below
    int x = 5; int y = 6;
    double q = y/x;
    System.out.println("Initial Q Divison Result: "+ (q));
    double yDouble = 3.2;
    q = yDouble;
    System.out.println("Redeclared Q: "+ (q));


    // Code for constant declaration below
    final int constVar = 4;
    int dynamicVar = 1;
    int constSum = constVar+dynamicVar;
    System.out.println("Final/Constant Sum: "+constSum);



    // Code for Hot Chocolate Cafe below
    double hotCoco = 2.42;
    double icedCoco = 3.21;
    double whiteCoco = 5.43;
    double subtotal = ((hotCoco*3)+(icedCoco*4)+(whiteCoco*2));
    double totalSale;
    final double SALES_TAX = .0875; // 8.75% Tax
    totalSale = (subtotal+(subtotal*SALES_TAX)); //Calculates tax and adds it to totalSale
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Subtoal: $"+ (subtotal));
    System.out.println("Sale Total: $"+(df.format(totalSale)));

  }
}
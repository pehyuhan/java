import java.util.Scanner;
import java.util.Arrays;

class SumThreeDigit
{
   public static void main(String args[])
   {
    int number;
    System.out.println("Enter an three digit integer: ");
    Scanner in = new Scanner(System.in);
    number = in.nextInt();
    String str = Integer.toString(number);
    String ss[] = str.split("");
    // System.out.println(Arrays.toString(ss));
    // output == [, 2, 3, 4];
    int i = 
            Integer.parseInt(ss[1]) + 
            Integer.parseInt(ss[2]) + 
            Integer.parseInt(ss[3]);
    System.out.println(i);
   }
}
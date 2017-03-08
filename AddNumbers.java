import java.util.Scanner;

class AddNumbers
{
   public static void main(String args[])
   {
      int w, x, y, z;
      System.out.println("Enter three integers to calculate their sum ");
      Scanner in = new Scanner(System.in);
      w = in.nextInt();
      x = in.nextInt();
      y = in.nextInt();
      z = w + x + y;
      double a = ((double) z) / 3;
      System.out.println("Sum of entered integers = "+z);
      System.out.println("Average of entered integers ="+a);
   }
}
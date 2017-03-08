import java.util.Scanner;

class Temperature
{
   public static void main(String args[])
   {
      int f;
      System.out.println("Enter the temperature in Fahrenheit: ");
      Scanner in = new Scanner(System.in);
      f = in.nextInt();
      double c = ((((double) f)-32)*5) / 9;
      System.out.println("Temperature in Centigrade = " +c);
   }
}
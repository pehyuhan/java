import java.util.Scanner;

class Consecutive
{
   public static void main(String args[])
   {
      int c;
      System.out.println("Enter an integer: ");
      Scanner in = new Scanner(System.in);
      c = in.nextInt();
      System.out.println("Entered integer = " +c);
      System.out.println("1st Consecutive integer = " +(c+1));
      System.out.println("2nd Consecutive integer = " +(c+2));
   }
}
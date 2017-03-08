import java.util.Scanner;

class ConvertTime
{
   public static void main(String args[])
   {
    int input;
    System.out.println("Enter the time in seconds: ");
    Scanner in = new Scanner(System.in);
    input = in.nextInt();
        int hours = input/3600;
        int minutes = (input%3600)/60;
        int seconds = ((input%3600)%60);
    System.out.println(hours + " hours, " + minutes + " minutes and " + seconds + " seconds");
   }
}
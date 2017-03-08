import java.util.Scanner;

class AreaOfTriangle
{
   public static void main(String args[])
   {
    int a, b, c;
    double s, area, x;
    System.out.println("Enter the three sides of a triangle ");
    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    s = ((double)(a + b + c)) / 2;
    x = s*(s - ((double)a))*(s - ((double)b))*(s - ((double)c));
    area = Math.sqrt(x);
    System.out.println(area);
   }
}
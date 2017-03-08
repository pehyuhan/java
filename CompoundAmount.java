import java.util.Scanner;

class CompoundAmount
{
   public static void main(String args[])
   {
    double loanAmount, durationInYears, interestInPercent, compoundedAmount, x, y;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Loan Amount: ");
    loanAmount = in.nextInt();
    System.out.println("Enter the Duration in Years: ");
    durationInYears = in.nextInt();
    System.out.println("Enter the Interest in Percent: ");
    interestInPercent = in.nextInt();
    x = 1 + (interestInPercent/100);
    y = Math.pow(x, durationInYears);
    compoundedAmount = loanAmount * y;
    System.out.println(compoundedAmount);
   }
}
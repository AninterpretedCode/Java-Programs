import java.util.Scanner;
class CompoundInterest{
    double p = 12.6, r=7.52, n=2, t=3;
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the original amount (p): ");
            double p = scan.nextDouble();
            System.out.println("Enter the annual interest rate (r): ");
            double r = scan.nextDouble();
            System.out.println("Enter the number if times interest is compunded (n): ");
            double n = scan.nextDouble();
            System.out.println("Enter the time (in years): ");
            double t = scan.nextDouble();
            double CI = p*(Math.pow(1+(r/n),(n*t)))-p;
            System.out.println("Compound interest will be: "+ CI);
        }
    }
}
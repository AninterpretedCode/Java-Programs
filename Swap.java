import java.util.Scanner;
class Swap{
    public static void main(String args[]){
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the first number: ");
            int a = scan.nextInt();
            System.out.print("Enter the second number: ");
            int b = scan.nextInt();
            a = a+b;
            b = a-b;
            a = a-b;
            System.out.println("After swapping value of a is: "+ a + " and value of b is: "+ b);
        }
    }
}
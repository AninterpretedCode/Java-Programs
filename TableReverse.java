import java.util.Scanner;
class TableReverse{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the first number: ");
            int n1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int n2 = scan.nextInt();
            int i,j;
            for(i=0,j=10 ; i<=10 && j>=1 ; i++,j--){
                System.out.println(n1 + "X" + i + "=" + n1*i + "\t" + n2 + "X" + j + "=" + n2*j);
            }
        }
    }
}
import java.util.Scanner;  
class SwapWithoutArithmeticOperator   
{  
    public static void main(String a[])   
    {   
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the value of x: ");     
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");    
        int y = sc.nextInt();  
        System.out.println("Before swapping numbers: \nx is: "+x +" & y is: "+ y);    
        x = x ^ y;            // '^' is XOR 
        y = x ^ y;   
        x = x ^ y;   
        System.out.println("After swapping: \nx is: "+x +" & y is: " + y);   
    }   
}  
import java.util.Scanner;

class ExceptionHandling{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (1/2/3): ");
        int ch = sc.nextInt();
        switch(ch){
            case 1: try{
                int data = 13/0;
            }
            catch(Exception e){
                System.out.println(e);
            }
            break;
            case 2: try{
                String str = null;
                System.out.println(str.length());
            }
            catch(Exception a){
                System.out.println(a);
            }
            break;
            case 3: try{
                int arr[] = new int[5];
                arr[12] = 89;
            }
            catch(Exception e){
                System.out.println(e);
            }
            break;
            default: System.out.println("Wrong choice!");
        }
    }
}
class Sum{
    void func(int a, int b){
        int c = a+b;
        System.out.println("Addition of two integers a and b is: " + c);
    }
    void func(int a, int b, int c){
        int d = a+b+c;
        System.out.println("Addition of three integers a,b and c is: " + d);
    }
    void func(double a, double b){
        double c = a+b;
        System.out.println("Addition of two float variables is: "+ c);
    }
}
public class Overloading{
    public static void main(String args[]){
        Sum obj = new Sum();
        obj.func(10,45);
        obj.func(23,54,71);
        obj.func(23.8,12.4);
    }
}
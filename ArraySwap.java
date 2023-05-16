public class ArraySwap {
    public static void main(String args[]){
        int n1=7, n2=8;
        int[] arr1, arr2, temp;
        arr1 = new int[12]; arr2 = new int[12]; temp = new int[12];
        System.out.println("Before swapping First array is: ");
        for(int i=1; i<=10; i++){
            System.out.print(arr1[i] = i*n1);
            System.out.print("\t");
        }
        System.out.println("\nSecond array is: ");
        for(int j=1; j<=10; j++){
            System.out.print(arr2[j] = j*n2);
            System.out.print("\t");
        }
        for(int k=1; k<=10; k++){
            temp[k] = arr1[k];
            arr1[k] = arr2[k];
            arr2[k] = temp[k];
        }
        System.out.println("\nAfter swapping First array is: ");
        for(int a=1; a<=10; a++){
            System.out.print(arr1[a] + "\t");
        }
        System.out.println("\nSecond array is: ");
        for(int a=1; a<=10; a++){
            System.out.print(arr2[a] + "\t");
        }
    }
}


import java.util.Scanner;

class Recurtion9{
    public static boolean isSorted(int arr[],int index){
       if(index==arr.length-1){
        return true;
       }
        if(arr[index]<arr[index+1]){
            return isSorted(arr, index+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
         for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(" "+arr[i]+" ");
        }
        boolean result=isSorted(arr,0);
        System.out.println(result);
    }
}
import java.util.*;
// printing sorted array
class Sorting1{
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        // taking the array from the user
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Length of array");
      int n = sc.nextInt();// array lenth
      int arr[]= new int[n];
      System.out.print("Enter "+n+" elements:");
      for(int i=0;i <n; i++){
        arr[i]=sc.nextInt();  // taking array elements
      }
        // bubble sorting logic 
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                //swapping element 
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
        printArr(arr); // Print function call
    }
}
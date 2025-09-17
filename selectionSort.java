
import java.util.Scanner;

class selectionSort{
    public static void printArr(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of element");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+n+" Element");
        for (int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0; i<arr.length; i++){
            int smallest= i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
                }
                printArr(arr);
        
    }
}
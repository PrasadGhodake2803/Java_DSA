
import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void printSum(int num, int i , int sum){

        if(i==num){
            sum+=i;
            System.out.println("Addition is:"+sum);
            return;
        }
        sum+=i;
        printSum(num, i+1, sum);
        
}

    public static void main(String args[] ){
        System.out.println("Enter Number :");
        Scanner sc= new Scanner (System.in);
        int num = sc.nextInt();
        int i=1;
        int sum=0;
        printSum(num, i, sum);

    }
}

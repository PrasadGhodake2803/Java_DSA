
import java.util.Scanner;

public record Recursion2() {
    public static  int printNum(int num ){
        
        if(num==1 || num==0){
           
            return 1 ;
        }
        
        int fact_nm=printNum(num-1);
        int fact= num*fact_nm;
        return fact;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int fact = printNum(num);
         System.out.println("Factorial is:"+fact);
    }
}

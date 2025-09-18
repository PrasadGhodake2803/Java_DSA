import java.util.Scanner;

class Recurtion7{
    public static void printRevString(String src,int index){

        if (index==0){
            System.out.print(" "+src.charAt(index));
            return ;
        }
       
        System.out.print(" "+src.charAt(index));
        printRevString(src, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String src= sc.nextLine();
       // int index= src.length()-1; 
        printRevString(src, src.length()-1);

    }
}
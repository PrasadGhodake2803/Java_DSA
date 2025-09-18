import java.util.*;
class Recurtion8{
    public static int firstIndex= -1;
    public static int lastIndex = -1;
    public static void printOccurance(String str, char element, int index){
 
        if(index==str.length()){
            System.out.println("FirstIndex: "+firstIndex+" Last Index: "+lastIndex);
            return;
        }
        char current = str.charAt(index);
        if(current== element){
            if(firstIndex==-1){
            firstIndex= index;
        }else{
            lastIndex= index;
        }
    }
        printOccurance(str, element, index+1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str= sc.nextLine();
        System.out.println("Enter Occurance Letter");
        char occ= sc.next().charAt(0);
        printOccurance(str,occ ,0);
    }
}
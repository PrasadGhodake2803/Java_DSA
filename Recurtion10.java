import java.util.*;
class Recurtion10{
    public static void lastIndex( String str, char ch, int index, int count){
        
        if(index==str.length()-1){
            
            for (int i = 0 ;i <= count; i++){
                System.out.print(" "+ch);
            }
                return;
            }
        
        if(str.charAt(index)==ch){
            count++;
        }else{
            System.out.print(" "+str.charAt(index));
        }
        lastIndex(str, ch, index+1, count);

    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        System.out.println("Enter element which you won't to find:");
        char ch= sc.next().charAt(0);
       int count=0;
        lastIndex(str, ch, 0, count);
        // for(int i=0; i<str.length();i++){
        //     if(str.charAt(i)==ch){
        //         count++;
        //     }else{
        //         System.out.print(" "+str.charAt(i));
        //     }
            
            
        // }
        // for (int i=0; i<count; i++){
        //     System.out.print(" "+ch);
        // }
    }
}
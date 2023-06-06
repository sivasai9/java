package strings;
import java.util.*;
public class digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean flag=false;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int val=ch-'0';
            if(val>=0 && val<=9){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

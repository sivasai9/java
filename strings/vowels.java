
import java.util.*;
public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        boolean st=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                st=true;
            }
            else{
                st=false;
                break;
            }
        }
        if(st){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}

package strings;
import java.util.*;
public class toggel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
       String str1="";
        for(int i=0;i<str.length();i++){
            str1+=(char)(str.charAt(i)^32);
        }
        System.out.println(str1);
    }
}


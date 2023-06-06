package strings;
import java.util.*;

public class cons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println(even_count+" "+odd_count);
    }
}

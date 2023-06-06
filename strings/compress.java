package strings;
import java.util.*;
public class compress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=str.charAt(0);
        int count=0;
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
            else{
                s+=ch+""+count;
                ch=str.charAt(i);
                count=1;
            }
        }
      s+=ch+""+count;
        System.out.println(s);
    }

}

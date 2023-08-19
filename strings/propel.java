import java.util.*;
public class propel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String input = sc.next();
        System.out.println("chal");
        String chal=sc.next();
        String compressed = pro(input,chal);
        System.out.println(compressed);
         
    }
    public static String pro(String s,String chal) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                str.append(count).append(s.charAt(i));
                str.append("X");
                count = 1;
            }
        }
        String s1="";
        for(int i=0;i<chal.length();i=i+2){
            
        }
        
        return str.toString();
    }
}


import java.util.*;
public class repetaing_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            String ans=".";
            int count=0;
            for(int i=0;i<str.length();i++){
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)) {
                        System.out.println(str.charAt(i));
                        count=1;
                        break;
                    }
                }
            }
            if(count==1){
                System.out.println(ans);

            }
        }

    }
}

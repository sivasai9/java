
import java.util.*;
public class ava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b>2*c){
                System.out.println("YEs");
            }
            else{
                System.out.println("NO");
            }
        }

    }

}


import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String str="";
        while(t-->0){
            int n=sc.nextInt();
            long arr[] =new long[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int q=sc.nextInt();
            while(q-->0) {
                long sum=0;
                int l=sc.nextInt();
                int r=sc.nextInt();
                for (int i =l; i <= r; i++) {
                    sum = sum + arr[i-1];
                }
                str=str+sum+" ";
            }
        }
        for(String str1:str.split(" ")){
            System.out.println(str1);
        }


    }
}

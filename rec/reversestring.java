import java.util.Arrays;

public class reversestring {
    public static void main(String[] args) {
        char ch1[]={'a','b','c','d','f'};
        reverseString(ch1);
        System.out.println(Arrays.toString(ch1));
        
    }
    public static  void reverseString(char[] ch) {
        int s=0;
        int l=ch.length-1;
        reverse(ch,s,l);
    }
    public static void reverse(char[] c,int s,int l){
        if(s>=l){
            return;
        }
        char temp=c[s];
        c[s]=c[l];
        c[l]=temp;
        reverse(c, s+1, l-1);
    }


    
}

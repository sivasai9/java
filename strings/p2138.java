import java.util.Arrays;

public class p2138 {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        System.out.println(Arrays.toString(divideString(s, k, fill)));
        
    }
    public static String[] divideString(String s, int k, char fill) {
        int rem=0;
        if(s.length()%k!=0){
            rem=k-s.length()%k;
        }
        for(int i=0;i<rem;i++){
            s=s+fill;
        }
        String []arr=new String[s.length()/k];
        int index=0;
        for(int i=0;i<s.length();i+=k){
            arr[index]=s.substring(i, i+k);
            index++;
        }
        return arr;
        
        
    }
    
}

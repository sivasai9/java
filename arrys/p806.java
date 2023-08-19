import java.util.Arrays;

public class p806 {
    public static void main(String[] args) {
        int []widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths, s)));
        
    }
    public static int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int count=0;
        // int arr[]=new int[2];
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            sum=sum+widths[ch[i]-'a'];
            if(sum>=100){
                sum=0;
                count++;
            }
        }
        // arr[0]=count;
        // arr[1]=sum;
        return new int[]{count+1,sum};
    }
    
}

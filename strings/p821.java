import java.util.Arrays;

public class p821 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
        
    }
    public static int[] shortestToChar(String s, char c) {
        int [] arr=new int[s.length()];
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(ch[j]==c){
                    arr[i]=Math.abs(i-j);
                    break;
                }
                }
            }
            return arr;
    }
        
    }
    


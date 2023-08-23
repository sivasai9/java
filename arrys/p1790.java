import java.util.Arrays;

public class p1790 {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
        
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        int [] arr=new int[26];
        int []arr2=new int[26];
        int count=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch!=ch2){
                count++;
            }
            if(count>2) return false;
            arr[ch-'a']++;
            arr2[ch2-'a']++;
        }
        return Arrays.equals(arr,arr2);
        
    }
    
}

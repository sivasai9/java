import java.util.HashSet;

public class checknumberisfacinating {
    public static void main(String[] args) {
        int num=783;
        System.out.println(isFascinating(num));

        
    }
     public static boolean isFascinating(int n) {
        String str=""+2*n+3*n+n;
        System.out.println(str);
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
            set.add(str.charAt(i));
            }
        }
        System.out.println(set.size());
        return set.size()==9;
    }
    
}

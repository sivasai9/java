import java.util.*;
public class Binary_gap {
    public static void main(String[] args) {
        int num=22;
        System.out.println(binaryGap(num));
    }

    public static int binaryGap(int n) {
        char [] ch=Integer.toBinaryString(n).toCharArray();
        List<Integer> indices=new ArrayList<>();    
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                indices.add(i);
            }
        }
            if (indices.size()==0) return 0;
            int res=0;
            for(int j=0;j<indices.size()-1;j++){
                res=Math.max(res,indices.get(j+1)-indices.get(j));
            }
        return res;
        
    }
}

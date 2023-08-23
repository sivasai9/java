public class p1422 {
    public static void main(String[] args) {
        String s="010110";
        System.out.println(maxScore(s));
        
    }
    public static int maxScore(String s) {
        int res=0;
        int count0=0;
        int count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count1++;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count0++;
            }
            else{
                count1--;
            }
            int d=count0+count1;
            if(d>res){
                res=d;

            }
        }
        return res;

        
    }
    
}

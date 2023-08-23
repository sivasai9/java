public class p22496 {
    public static void main(String[] args) {
        String []strs = {"alic3","bob","3","4","00000"};
        System.out.println(maximumValue(strs));
        
    }
    public static int maximumValue(String[] strs) {
        int count=0;
        for(String str:strs){
            count=Math.max(count,res(str));
        }
        return count;
    }
    public static int res(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                return s.length();
            }
        }
        return Integer.parseInt(s);
    }

    
}

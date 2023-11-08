public class p1957 {
    public static void main(String[] args) {
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }
    public static String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length()-3;i++){
            if(s.charAt(i)==s.charAt(i+1)&& s.charAt(i+1)==s.charAt(i+2) 
            && s.charAt(i+2)==s.charAt(i)){
                sb.replace(i, i+1, "");
            }
        }
        return sb.toString(); 
    }

    
}

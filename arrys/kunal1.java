public class kunal1 {
    public static void main(String[] args) {
        // skip("","baccdah");
        // System.out.println(skip("baccdah"));
        System.out.println(skipappnotapple("bacappleaa"));
    }
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
     public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else{
            return skip(up.substring(1));
        }
    }
    public static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }
        else{
            return up.charAt(0)+skipapple(up.substring(1));
        }
    }
     public static String skipappnotapple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")&& !up.startsWith("apple")){
            return skipappnotapple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipappnotapple(up.substring(1));
        }
    }
    
}

public class lengthodstring {
    public static void main(String[] args) {
        String str="siva";
        System.out.println(length(str)); 
    }
    public static int length(String str){
        if(str.equals("")){
            return 0;
        }

        return 1+length(str.substring(1));

    }
    
}

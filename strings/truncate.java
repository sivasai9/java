public class truncate {
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
        
    }
    public static String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        String str1="";
        for(int i=0;i<k;i++){
            str1=str1+str[i]+" ";
        }
        return str1.trim();
    }
    
}

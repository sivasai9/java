public class reverseletters {
    public static void main(String[] args) {
        String str="ab-cd";
        System.out.println(reverseOnlyLetters(str));
        
    }

    public static String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(isalphabetic(ch[i])){
                if(isalphabetic(ch[j])){
                    char ch1=ch[i];
                    ch[i++]=ch[j];
                    ch[j--]=ch1;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return new String(ch); 
    }
    public static boolean isalphabetic(char ch){
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            return true;
        }
        return false;
    } 
}

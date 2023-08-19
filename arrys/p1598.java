public class p1598 {
    public static void main(String[] args) {
         String []logs = {"d1/","d2/","../","d21/","./"};
         System.out.println(minOperations(logs));
        
    }
    public static int minOperations(String[] logs) {
        int count=0;
        for(String str:logs){
            count=count+check(str);
            count=count<0?0:count;
        }  
        return count;
    }
    public static int check(String str){
        if(str.equals("../")){
            return -1;
        }
        else if(str.equals("./")){
            return 0;

        }
        return 1;
    }
}

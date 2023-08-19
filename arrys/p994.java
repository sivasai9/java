public class p994 {
    public static void main(String[] args) {
        
        String []strs = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }
     public static  int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            char check='0';
            for(String str:strs){
                char ch=str.charAt(i);
                if(check>ch){
                    count++;
                    break;
                }
                check=ch;
            }


        }
        return count;
    }

    
}

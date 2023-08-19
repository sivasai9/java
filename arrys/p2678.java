public class p2678 {
    public static void main(String[] args) {
        String []details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
        
    }
    public static int countSeniors(String[] details) {
        int count=0;
        for(String str:details){
            String s=str.substring(11, 13);
            // System.out.println(s);
            if((Integer.parseInt(s))>60){
                count++;
            }

        
        }
        return count;
    }
    
}

import java.util.HashSet;
import java.util.Set;

public class p292 {
    public static void main(String[] args) {
        String []emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(emails);
        
    }
    public static int numUniqueEmails(String[] emails) {
        Set<String> set= new HashSet<>();
        int count=0;
        for(String str:emails){
            int attindex=str.indexOf('@');
            int plusindex=str.indexOf('+');
            String s="";
            if(plusindex>=0){
                s=s+s.substring(0, plusindex);
            }
            else{
                s+=s.substring(0, attindex);
            }
            s=s.replace(".", "")+s.substring(attindex);
            System.out.println(s);
            if(set.add(s)){
                count++;
            }
          

        }
        return count;
        
    }
    
}

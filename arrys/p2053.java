import java.util.ArrayList;
import java.util.HashMap;

public class p2053 {
    public static void main(String[] args) {
        String []arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Boolean> map=new  HashMap<>();
        int count=0;
        for(String str:arr){
            if(map.containsKey(str)){
                map.put(str,false);
            }
            else{
                map.put(str,true);
            }
        }
        for(String str:arr){
            if(map.get(str)==true){
                count++;
                if(count==k){
                    return str;
                }
            }
        }
        return "";

        
        
    }
    
}

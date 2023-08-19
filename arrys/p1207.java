import java.util.*;

public class p1207 {
    public static void main(String[] args) {
       int[] arr = {1,2,2,1,1,3};
       System.out.println(uniqueOccurrences(arr));
        
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                list.add(count);
                count=1;
            }  
        }
        list.add(count);
        HashSet<Integer> set=new HashSet<>(list);
        return set.size()==list.size();

        
    }
    
}

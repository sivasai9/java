import java.util.ArrayList;
import java.util.List;

public class p228 {
    public static void main(String[] args) {
        int []nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
     public static List<String> summaryRanges(int[] arr) {
        List<String> list=new ArrayList<>();
        int index=0;
        while(index<arr.length){
            int s;
            int e;
            s=arr[index];
            while(index+1<arr.length && arr[index]+1==arr[index+1]){
                index++;
            }
            e=arr[index];
            if(s==e){
                list.add(s+"");
            }
            else{
                list.add(s+"-->"+e);
            }
            index++;
        }
        return list;
    }
    
}

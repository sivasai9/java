package sorting_algo;
import java.util.*;

public class miss_num {
    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};

        System.out.println(m_num(arr));
        
    }


    static List<Integer> m_num(int arr[]){
       
        int i=0;
        while(i<arr.length){
            int corr=arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=arr[corr]){
                swap(arr,i,corr);
            }
            else{
                i++;
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int j=0;j<arr.length;i++){
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }

        return list;

    }

    static void swap(int [] a,int first,int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }


    
}

package arrys;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class array_form {
    public static void main(String[] args) {

        int [] arr={9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr, 1));
        
    }
    public static int addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        int sum=0;
        int total_sum;
        for(int i=0;i<num.length;i++){
            sum=sum*10+num[i];
        }
        total_sum=k+sum;
        // while(total_sum>0){
        //     list.add(total_sum%10);
        //     total_sum/=10;
        // }
        // Collections.reverse(list);
        return sum;

        
    }
    
}

package searching;

import java.util.ArrayList;

public class lineaesearch2 {
    public static void main(String[] args) {
        int [] a={1,4,3,2,55,4};
        int target=4;
        fun(a,target,0);
        System.out.println(list);

        
    }
    static ArrayList<Integer> list= new ArrayList<Integer>();
    static void fun(int []a,int target,int index){
        if(index==a.length){
            return;
        }
        if(a[index]==target){
            list.add(index);
        }
        fun(a,target,index+1);
      

    }
    
}

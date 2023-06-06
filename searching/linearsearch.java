package searching;

public class linearsearch {
    public static void main(String[] args) {
        int [] a={4,5,67,43};
        int target=43;
        System.out.println(fun(a,43,0   ));
        
    }
    static int fun(int [] a,int target,int index){
        if(index==a.length){
            return -1;
        }
        if(a[index]==target){
            return index;
        }
        else{
            return fun(a,target,index + 1);

        }
       

      


    }
    
}

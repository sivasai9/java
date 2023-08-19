// package rec;

public class linearsearch {
    public static void main(String[] args) {
        int []arr={1,23,5,6,4,32};
        System.out.println(linear(arr, 32, 0));
        
    }
    public static boolean linear(int []arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || linear(arr,target,index+1);

        }
        

    
}

public class linear {
    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7,8};
        int target=8;
        System.out.println(linear(arr, target));
        
    }
    public static int linear(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
}

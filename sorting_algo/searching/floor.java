public class floor {
    public static void main(String[] args) {
        int[]arr={1,3,4,3,5,6,7};
        System.out.println(binary_search(arr, 2));
        
    }
    static int binary_search(int[]arr,int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(tar>arr[mid]){
                start=mid+1;
            }
            else if(tar<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return arr[end];
    }
    
}

public class ceilnumber {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,14,16,17};
        System.out.println(binary_search(arr, 15));
        
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
        return arr[start];
    }
    
}

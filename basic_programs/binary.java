public class binary {
    public static void main(String[] args) {

        
    }
    
    public static int bin(int arr[],int target){
    int s=0;
    int e=arr.length-1;
    while(s<e){
        int mid=(s+e)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
        s++;
        e--;
    }
    return -1;
}

}


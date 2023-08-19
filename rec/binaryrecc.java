// package rec;

public class binaryrecc {
    public static void main(String[] args) {
       int arr[]={1,5,6,3,9};
       int end=arr.length-1;
        System.out.println(search(arr,9,0,end));
    }
    public static int search(int arr[],int target,int s,int e){
        
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        
        return search(arr,target,m+1,e);
    

    }
    
}

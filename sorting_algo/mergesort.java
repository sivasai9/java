import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,32};
        System.out.println(merge(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int[] merge(int arr[]){
        if(arr.length==1){
                return arr;
        }
        int mid=arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr, 0, mid));
        int [] right=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return swap(left,right);

    }
    public  static int[] swap(int[] left,int[] right){
        int []arr=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        // copying remaining elements
        while(i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
        return arr;
          

    }
    
}

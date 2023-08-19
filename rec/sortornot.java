public class sortornot {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(sorted(arr,0));
        
    }
    // usig recursion
    public static boolean sorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);


    }
    // public static boolean sort(int arr[]){
    //     int i=0;
    //     for (int j = i+1; j <arr.length && i<arr.length ; j++) {
    //         if(arr[i]>arr[j]){
    //             return false;
    //         }
    //         else{
    //             i++;

    //         } 
    //     }
    //     return true;
    // }
    
}

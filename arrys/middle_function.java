

public class middle_function {
    public static void main(String[] args){
        int arr[] ={1,2,34,5};
        System.out.println(middle(arr));


    }
    public static int[] middle(int[] array) {
        int [] arr =new int[2];
        int n=array.length;
        for(int i=1;i<n-1;i++){
            arr[i-1]=array[i];
        }
        return arr;
    }


}

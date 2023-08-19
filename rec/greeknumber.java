public class greeknumber {
    public static void main(String[] args) {
        int arr[]={1,3,5};
        System.out.println(geekfib(arr,3));
        
    }
    static int geekfib(int arr[],int n){
        if(n==1){
            return 1;
            
        }
        return geekfib(arr, arr[n-1])+geekfib(arr,arr[n-2])+geekfib(arr, arr[n-3]);

    }
    
}

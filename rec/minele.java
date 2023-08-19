public class minele {
    public static void main(String[] args) {
        int  []arr={2,3,5,12,4,100,-1};
        int n=arr.length-1;
        System.out.println(minvalue(arr,n));        
    }
    public static int minvalue(int[]arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n],minvalue(arr,n-1));
    }
    
}

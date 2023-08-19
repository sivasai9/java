public class p1394 {
    public static void main(String[] args) {
        int []arr = {1,2,2,3,3,3};
        System.out.println(findLucky(arr));

        
    }
    public static int findLucky(int[] arr) {
        int count=0;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                // System.out.println();
            }
             if(count==arr[i]){
                    max=Math.max(max,arr[i]);
                }

        }
        return max; 
    }
    
}

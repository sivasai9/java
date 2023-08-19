public class p1534 {
    public static void main(String[] args) {
        int []arr = {3,0,1,1,9,7};
        int a = 7, b = 2, c = 3;
        System.out.println(countGoodTriplets(arr, a, b, c));

        
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                if(Math.abs(arr[i]-arr[j])<=a)
                    for(int k=j+1;k<arr.length;k++){
                        if(Math.abs(arr[j]-arr[k])<=b)
                            if(Math.abs(arr[i]-arr[k])<=c)
                                count++;
                    }
        return count;
    }
    
}



public class twosum2 {
    public static void main(String[] args) {

        int []numbers = {2,7,11,15};
        int target = 9;
        System.out.println( twoSum(numbers,target));
        
        
    }
    public static int[] twoSum(int[] numbers, int target) {
        int [] arr=new int[2];
        int start=1;
        int end=start-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                arr[0]=end;
                arr[1]=start;
            }
            start++;
            end++;

        }

        return arr;


        
        
    }
}


public class duplicat {

    public static void main(String[] args) {
        int arr[]={2,3,4,4,5};
        System.out.println(dup(arr));
        
    }
    static int dup(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            

        }
        return count;

    }

    
}

// package rec;

public class sorted {
    public static void main(String[] args) {
        int [] a={1,2,3,14,5};
        System.out.println(fun(a,0));
        
    }
    static boolean fun(int [] arr, int index){
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && fun(arr,index+1);

    }
    
}

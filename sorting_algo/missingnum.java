package sorting_algo;

public class missingnum {
    public static void main(String[] args) {
        int arr []={3,0,1};
      
        System.out.println(  miss(arr));

        
    }
    static int miss(int [] a){
        int i=0;
        while(i<a.length){
            int correct=a[i];
            if(a[i]<a.length && a[i]!=a[correct]){
                swap(a,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<a.length;j++){
            if(a[j]!=j){
                return j;
            }

        }

        return  a.length;

     

    }

    

           
        

        static void swap(int []arr,int start,int second){
            int temp=arr[start];
            arr[start]=arr[second];
            arr[second]=temp;

        }
    }
    



    


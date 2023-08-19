public class number_complient {
    public static void main(String[] args) {
        int num=5;
         System.out.println(findComplement(num));
        
    }
     public static int findComplement(int num) {
         int n=0;
         while(n<num){
            n=(n<<1)|1;
         }
         return n-num;
     }
    
}

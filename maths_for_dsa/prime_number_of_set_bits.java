public class prime_number_of_set_bits {
    public static void main(String[] args) {
        int left=10;
        int right=15;
        System.out.println(countPrimeSetBits(left, right));
        
    }
    public static int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String str=Integer.toBinaryString(i);
            int bits=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    bits++;
                }
            }
            if(isprime(bits)){
                count++;
            }

        }
        return count;
    }
    public static boolean isprime(int num){
         if(num==0 || num==1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    } 
   
    
}

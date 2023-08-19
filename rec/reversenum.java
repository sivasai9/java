public class reversenum {
    public static void main(String[] args) {
        int num=12345;
        System.out.println(rev(num));
        
    }
    static int sum=0;
    public static int rev(int num){
        if(num==0){
            // return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        rev(num/10);
        return sum;

        }
    
}

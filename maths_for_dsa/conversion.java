public class conversion {
    public static void main(String[] args) {
        int base=8;
        int num=9;
        System.out.println(conver(num,base));
        
    }
    public static String conver(int n,int k){
        String str="";
        while(n>0){
            int rem=n%k;
            str=str+rem;
            n=n/k;
        }
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        return str1;
    }
    
}

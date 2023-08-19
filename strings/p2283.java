public class p2283 {
    public static void main(String[] args) {
        String num = "030";
        System.out.println(digitCount(num));
        
    }
    public static boolean digitCount(String num) {
        char ch[]=num.toCharArray();
         boolean check=false;
        for(int i=0;i<ch.length;i++){
            int count=0;
           for(int j=0;j<ch.length;j++){
                 if(ch[j]-'0'==i){
                    count++;
                 }
           }
        System.out.println(count);
         System.out.println(ch[i]);
           if(count==(ch[i]-'0')){
            check=true;
           }
           else{
            check=false;
           }
           System.out.println(check);

        }
        return check;
    }
    
}

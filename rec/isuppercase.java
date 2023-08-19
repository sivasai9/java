public class isuppercase {
    public static void main(String[] args) {
        String str="Siva sai krishna";
        System.out.println(find(str,str.length()-1));
        
    }
    static char find(String str,int n){
        if(n==1){
            return str.charAt(0);
        }
        if(Character.isUpperCase(str.charAt(n))){
            return str.charAt(n);
        }
        return find(str,n-1);


    }
    
}


public class shuffle {
    public static void main(String[] args) {
        String str="codeleet";
        int [] arr={4,5,6,7,0,2,1,3};
       
        System.out.println(restoreString(str, arr));

    }
    static String restoreString(String s, int[] indices) {
        char ch[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            ch[indices[i]]=s.charAt(i);

        }
        return new String(ch);      
        
    }
    
}

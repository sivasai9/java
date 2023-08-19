public class valuevariable {
    public static void main(String[] args) {
        String [] str={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(str));
        
    }
    public static int  finalValueAfterOperations(String[] str) {
        int X=0;
        for(int i=0;i<str.length;i++){
            if(str[i].charAt(1)=='+'){
                X++;
            }
            else{
                X--;
            }
        }
        return X;
    }
    
}

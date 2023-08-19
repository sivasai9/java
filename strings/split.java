

public class split {
    public static void main(String[] args) {
            String str="is2 sentence4 This1 a3";
            String []str3=str.split(" ", 0);
            for(String s:str3){
                System.out.println(s);
            }
            System.out.println(str3[0]);

    }
    
}

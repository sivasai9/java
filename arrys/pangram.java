
import java.util.*;
public class pangram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        HashSet <Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        if(set.size()==26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }

    }
}

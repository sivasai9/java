
import java.util.*;
public class sw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter fruit:");
        String fr=sc.next();
        switch(fr){
            case "Mango":
                System.out.println("mango is sweetest fruit");
                break;
            case "orange" :
                System.out.println("orange is  a colour");
                break;
            case "graphes":
                System.out.println("wine");
                break;
            default:
                System.out.println("pls enter a valid fruit");
        }


    }
}

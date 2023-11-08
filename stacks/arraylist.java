
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(2,3);
//        System.out.println(list.get(1));
//        for(int i=0;i<list.size();i++){
//////            System.out.println(list.get(i));
//////
//////        }
        for(int in:list){
           if(in==3){
               System.out.println("hi");
           }
        }

//        ArrayList<String> str=new ArrayList<>();
//        str.add("siva");
//        str.add("sai");
//        str.add("krishna");
//        System.out.println(str);

    }


}

import java.util.*;

public class p682 {
    public static void main(String[] args) {
        String [] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));

        
    }
    public static int calPoints(String[] o) {
        int count=0;
        List<Integer> list=new ArrayList<>();
        for(String str:o){
            if(str.equals("C")){
                list.remove(list.size()-1);
            }
            else if(str.equals("D")){
                int res=2*list.get(list.size()-1);   
                list.add(res);             
            }
            else if(str.equals("+")){
                int sum=list.get(list.size()-1)+list.get(list.size()-2);
                list.add(sum);
            }
            else{
                int t=Integer.parseInt(str);
                list.add(t);
            }

        }
        for(int i:list){
            count=count+i;
        }
        return count;
        
    }
    
}

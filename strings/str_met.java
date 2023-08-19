

import java.util.ArrayList;

public class str_met {
    private static final String List = null;

    public static void main(String [] args){
        String str="siva sai krishna";

        String str2="siva";
        String str3="hasrith";
        String str4="siva varshini";

        System.out.println(str2.charAt(0));

        System.out.println(str2.compareTo(str4));
        String str5=str2.concat(str4);
        System.out.println(str5);
        if(str2.contains(str4)){
            System.out.println("found");
        
        }
        else{
            System.out.println("not found");
        }
        int index=str4.indexOf("varshini");
        System.out.println(index);
        // int len=str.length()-1;
        // int count=0;
        // char ch[]={'a','e','i','o','u'};
        // for(int i=0;i<len;i++){
        //     // if(i%2!=0){
        //     //     System.out.println(str.charAt(i));
        //     // }
            
        //     // if(str.charAt(i)=='a'){
        //     //     count++;
        //     // }
        //     if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i'||str.charAt(i)=='o' || 
        //     str.charAt(i)=='u'){
        //         System.out.println("vowel index position "+ i + " "+str.charAt(i));

        //     }







        // }
        // System.out.println(count);
        
        
    }

    
}

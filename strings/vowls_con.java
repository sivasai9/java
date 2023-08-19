
import java.util.*;
public class vowls_con {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String str = sc.nextLine();
            str.trim();
            int count_word = 0;
            int count_vowels = 0;
            int count_cions = 0;
            String[] str1 = str.split(" ");
            count_word = str1.length;
            for (int i = 0; i < str1.length; i++) {
                String s=str1[i];
                for(int j=0;j<s.length();j++){
                    char ch=s.charAt(j);
                    if(ch=='a' || ch== 'e' || ch=='o' || ch=='u' || ch=='i'){
                        count_vowels++;
                    }
                    else{
                        count_cions++;
                    }
                }

            }
            System.out.println(count_word+" "+count_vowels+" "+count_cions);
        }

    }
}

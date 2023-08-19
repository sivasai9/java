import java.io.BufferedReader;
import java.io.InputStreamReader;

public class res {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read the name from the input
        String s = br.readLine();
	    int []ch=new int[26];
	  
	    for(int i=0;i<s.length();i++){
		  ch[s.charAt(i)-'a']++;
		  
		  
		}
	  int res=0;
	  for(int i:ch){
		if(i>1){
		  res++;
		}
	  }
        System.out.println(res);
}
}

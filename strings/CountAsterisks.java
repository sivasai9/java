public class CountAsterisks {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(s));
        
    }
    public static int countAsterisks(String s) {
        int flag=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                flag++;
            }
            else if(flag%2==0 && s.charAt(i)=='*'){
                count++;
            }
        }
        return count;
        
    }
    
}

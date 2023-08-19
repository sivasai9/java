public class FindMaximumNumberofStringPairs {
    public static void main(String[] args) {
        String [] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
        
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                StringBuilder str=new StringBuilder(words[j]);
                str.reverse();
                if(words[i].equals(str.toString())){
                    count++;
                }
               
            }
        }
        return count;
        
    }
}

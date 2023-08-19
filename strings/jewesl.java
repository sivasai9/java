public class jewesl {
    public static void main(String[] args) {
        String str="aA";
        String str1="aAABBBB";
        System.out.println(numJewelsInStones(str, str1));
        
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
                
            }
            
        }
        return count;
        
    }
    
}

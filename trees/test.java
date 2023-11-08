public class test {
    public static String canCompleteWork(int n, int m, int g, int t, int D) {
        int totalTime = (n * t) + (m * (t + 2));
        int t1=totalTime+(g*(t-2));
        System.out.println(totalTime);
       
    
        if (t1 <= D) {
            return "Yes ";
        } else {
            return "No ";
        }
    }
    
    public static void main(String[] args) {
        int n = 3; 
        int m = 3; 
        int g = 9;
        int t = 6; 
        int D = 30; 
    
        String result = canCompleteWork(n, m, g, t, D);
        System.out.println(result);
    }
    
}

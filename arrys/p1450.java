public class p1450{
    public static void main(String[] args) {
        int []startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        System.out.println(busyStudent(startTime, endTime, queryTime));
    }
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for (int i = 0; i < endTime.length; i++) {
            if( startTime[i] <= queryTime && queryTime <= endTime[i]){
                count++;
            }  
        }   
        return count++;
    }
}
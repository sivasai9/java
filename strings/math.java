public class math {

    public static int mathChallenge(int num) {
        // Convert the number to an array of digits
        int[] digits = Integer.toString(num).chars().map(Character::getNumericValue).toArray();

        // Find the first digit that is smaller than the digit to its right
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no such digit is found, the number has no greater permutations
        if (i == -1) {
            return -1;
        }

        // Find the smallest digit to the right of digits[i] that is greater than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Swap digits[i] and digits[j]
        int temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Reverse the digits to the right of i
        reverseArray(digits, i + 1, digits.length - 1);

        // Convert the array of digits back to a number
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }

        return result;
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int exampleInput = 11121;
        int o = mathChallenge(exampleInput);
        System.out.println(o);
        String c = "5lmrtcpa2";
        String s=String.valueOf(o);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            str.append(s.charAt(i)).append(c.charAt(i));
        }
        for(int i=s.length();i<c.length();i++){
              str.append(c.charAt(i));
        }
        String n=str.toString();
        System.out.println(n);
        

       
    }
}

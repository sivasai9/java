public class chall {
    public static String StringChallenge(String str, int num) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int shift = num % 26; 
                if (Character.isUpperCase(c)) {
                    result.append((char) ((c - 'A' + shift) % 26 + 'A'));
                } else {
                    result.append((char) ((c - 'a' + shift) % 26 + 'a'));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputStr = "Hello";
        int num = 4;
        String o = StringChallenge(inputStr, num);
        String c = "5lmrtcpa2";
        StringBuilder str=new StringBuilder();
        for(int i=0;i<o.length();i++){
            str.append(o.charAt(i)).append(c.charAt(i));
        }
        for(int i=o.length();i<c.length();i++){
              str.append(c.charAt(i));
        }
        String n=str.toString();
        System.out.println(n);
    }
}

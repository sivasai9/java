public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str= "G()()()()(al)";
        System.out.println(interpret(str));
        
    }
    public static String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }
    
}

public class main {
    public static void main(String[] args) throws Exception {
        customstack stack=new customstack(5);
        stack.push(5);
        stack.push(5);
        stack.push(45);
        stack.push(9);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
    
}

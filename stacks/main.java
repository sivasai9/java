public class main {
    public static void main(String[] args) throws Exception {
        stack s= new dynamicstack(3);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.peek());
        
    }
    
}

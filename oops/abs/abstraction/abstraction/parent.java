package abs.abstraction.abstraction;

abstract public class parent {
    int age;
    public parent(int age){
        this.age=age;
    }
    abstract void career(String name);
    abstract void partner(String name,int age);
    static void hello(){
        System.out.println("hey");
    }
    
}

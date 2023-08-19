package abs.abstraction.abstraction;

public class child extends parent{

    public child(int age){
        super(age);
    }
    
    @Override
    void career(String name){
        System.out.println("I am going be"+name);

    }
    @Override
    void partner(String name,int age){
        System.out.println("my name is"+name+"and my age is"+age);

    }
    
}

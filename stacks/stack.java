
import java.util.*;

public class stack {
    protected int[] data;
    private static final int default_size=10;

    int ptr=-1;

    public stack(){
        this(default_size);
    }

    public stack(int size) {
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isfull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;

        return true;
    }
    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("cannot pop from empty stack");
        }
        // int rem=data[ptr];
        // ptr--;
        // return rem;
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isfull(){
        return ptr==data.length-1;
    }

    public boolean isempty(){
        return ptr==-1;
    }
    

}



  


    

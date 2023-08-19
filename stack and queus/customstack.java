public class customstack {
    protected int[]data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
     
    public customstack(){
        this(DEFAULT_SIZE);
    }

    public customstack(int size) {
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
            throw new Exception("cannot pop from an empty satck");

        }
        int remo=data[ptr];
        ptr--;
        return remo;
    }

    public int peek() throws Exception{
         if(isempty()){
            throw new Exception("cannot pop from an empty satck");
        }
        return data[ptr];

    }
    public  boolean isfull(){
        return ptr==data.length-1;
    }
    public boolean isempty(){
            return ptr==-1;
    }
    

    
}

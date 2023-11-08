public class cricular_queqe {
    protected int []data;
    private static final int default_size=10;
    protected int end=0;
    protected int front=0;
    private int size=0;

    public cricular_queqe(){
        this(default_size);
    }

    public cricular_queqe(int size){
        this.data=new int[size];
    }
    public boolean isfull(){
        return size==data.length;

    }
    public boolean isempty(){
        return size==0;

    }
    public boolean insert(int item){

        if(isfull()){
            return false;
                }

        data[end++]=item;
        end=end%data.length;
        size++;

        return true;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("queue is empty");
        }
        int rem=data[front];
        front=front%data.length;
        size--;
        return rem;
    }
    
    public void display(){
        for(int i=front;i<end;i++){
            System.out.print(data[i]+"<--");

        }
        System.out.println("end");
    }

    


    
}

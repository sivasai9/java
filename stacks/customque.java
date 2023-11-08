public class customque {
    private int [] data;
    private static final int default_size=10;

    int end=0;
    public customque(){
        this(default_size);
    }

    public customque(int size){
        this.data=new int[size];
    }

    public boolean isfull(){
        return end==data.length;
    }

    public boolean isempty(){
        return end==0;
    }

    public boolean insert(int item){
        if(isfull()){
            System.out.println("queue is full");
            return false;
        }
        data[end++]=item;
         return true;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        int remove=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return remove;
    }
    public int front() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        return data[0];

    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.println(data[i]+"--<");
        }
        System.out.println("end");

    }



    
}

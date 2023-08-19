package out;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertlast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;  
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val; 
    }

    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondlast=get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        size--;      
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next; 
        size--;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;

    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;

            }
            node=node.next;
        }
        return null;
    }




    public void dispaly(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");

    }

    public void duplicate(){
        Node node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
            tail=node;
            // tail.next=null;
        }
        
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.insertlast(1);
        list.insertlast(1);
        list.insertlast(2);
        // list.insertlast(3);
        // list.insertlast(3);
        // list.insertlast(3);
        // list.insertlast(4);
        list.dispaly();
        list.duplicate();
        list.dispaly();

        
    }
    private class Node{
        private int value;
        private Node next;
        

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

    }
    
}

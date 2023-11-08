package likedlist;

public class singlelist {
    private Node head;
    private Node tail;
    private int size;
    public singlelist(){
        this.size=0;
    }
    public void insertfirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }   
        size+=1;
    }
     public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;

     }
     public void insert(int val,int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size+=1;
     }
     public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(tail==null){
            tail=head;
        }
        size--;
        return val;
     }
     public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondlast=get(size-1);
        int val=tail.value;
        tail=secondlast;
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
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;

     }
   





     public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("End");
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



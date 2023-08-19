package out;

public class DLL {
    private Node head;
    private int size;
    public DLL(){
        this.size=size;
    }

    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void insertlast(int val){
        Node node=new Node(val);
        Node last=head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last; 
    }
   

    public void dispaly(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val+"-->");
            last=node;
            node=node.next;
        }
        System.out.println("End");

        while(last!=null){
            System.out.print(last.val+"-->");
            last=last.prev;        }
            System.out.println("start");
    }
















    private class Node{
       private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    
    } 
}

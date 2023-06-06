public class singlelinkedlist {
    public Node head;
    public Node tail;
    public int size;


    public Node createSingleLinkedList(int val){
        head= new Node();
        Node node=new Node();
        node.next =null;
        node.val=val;
        head=node;
        tail=node;
        size=1;
        return head;

    }
    // insertion method in singled linked list
    public void insertInLinedList(int nodevalue,int location){
        Node node=new Node();
        node.val=nodevalue;
        if(head==null){
            createSingleLinkedList(nodevalue);
            return;
        }
        else if(location==0){
            node.next=head;
            head=node;
        }
        else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else{

        }
    }

}

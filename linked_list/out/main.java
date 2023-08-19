package out;

public class main {
    public static void main(String[] args) {
        // LL list=new LL();
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(6);
        // list.insertFirst(5);
        // list.insert(100,3);
        // list.dispaly();
        // System.out.println(list.deletefirst());
        // list.dispaly();
        // System.out.println(list.deletelast());
        // list.dispaly();
        // System.out.println(list.delete(2));
        // list.dispaly();

        DLL list=new DLL();
        list.insertfirst(3);
        list.insertfirst(5);
        list.insertfirst(7);
        list.insertfirst(9);
        list.insertfirst(10);
        list.dispaly();
        list.insertlast(99);
        list.dispaly();

    }
    
}

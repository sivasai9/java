package likedlist;

public class main {
    public static void main(String[] args) {
        singlelist ls=new singlelist();
        ls.insertfirst(3);
        ls.insertlast(3);
        ls.insert(1,1);
        ls.display();
        ls.deletefirst();
        ls.display();
        ls.deletelast();
        ls.display();
        ls.delete(1);
        ls.display();
    }
}

import java.util.Scanner;

public class binarytree_pr {
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("enter the root node value");
        int val=sc.nextInt();
        root=new Node(val);
        populate(sc,root);  
    }
    private void populate(Scanner sc,Node node){
        System.out.println("do you want enter left of"+node.value);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value to the left of:"+node.value);
            int value=sc.nextInt();
            node.left=new Node(value);
            populate(sc, node.left);
        }
        System.out.println("enter the value of the right of:"+node.value);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value of the right of:"+node.value);
            int value=sc.nextInt();
            node.right=new Node(value);
            populate(sc, node.right);
        }
    }
    public void display(){
        display(this.root,"");
    }
    private void display(Node node,String s){
        if(node==null){

            return;
        }
        System.out.println(s+node.value);
        display(node.left, s);
        display(node.right, s);

    }
    
}

public class binarysearchtree {
    public binarysearchtree(){

    }
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;  
        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;  
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root=insert(value,root);

    }
    private Node insert(int value,Node node){
        if(node ==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void populate(int []arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }


    public void display(){
        display(root,"Root Node: ");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"left child of "+ node.getValue()+" : ");
        display(node.right,"right child of "+ node.getValue()+" : ");
    }

    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value);
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value);
    }



    
}

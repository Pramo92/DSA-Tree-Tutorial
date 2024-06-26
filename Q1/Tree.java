package Q1;

public class Tree {
    private Node root;

    public Tree(){
        root=null;
    }

    public void insert(int x){
        root= insert(root,x);
    }

    private Node insert(Node node, int x){
        if(node==null){
            node = new Node(x);
        }
        else{
            if(x<=node.data){
                node.left=insert(node.left,x);
            }
            else{
                node.right=insert(node.right,x);
            }
        }
        return node;
    }

    public void preorder(){
        preorder(root);
    }

    private void preorder(Node r){
        if(r!=null){
          System.out.print(r.data+" ");
          preorder(r.left);
          preorder(r.right);
        }
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node r){
        if(r!=null){
            inorder(r.left);
            System.out.print(r.data+" ");
            inorder(r.right);
        }
    }

    public void postorder(){
        postorder(root);
    }

    private void postorder(Node r){
        if(r!=null){
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data+" ");
        }
    }

}

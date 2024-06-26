package Q1;

public class Test {
    public static void main(String[] args){
        System.out.println("First sequence");
        int[] num1={50,25,75,10,30,60,90};

        Tree tree1 = new Tree();
        for(int x:num1){
            tree1.insert(x);
        }

        traversalOrders(tree1);
        System.out.println("Second sequence");
        int[] num2={17,8,25,6,11,23,30,56};

        Tree tree2 = new Tree();
        for(int x:num2){
            tree2.insert(x);
        }

        traversalOrders(tree2);
        System.out.println("Third sequence");
        int[] num3={70,35,90,15,50,80,100};

        Tree tree3 = new Tree();
        for(int x:num3){
            tree3.insert(x);
        }

        traversalOrders(tree3);
        System.out.println("Fourth sequence");
        int[] num5={28,14,42,7,21,35,56,70,84};

        Tree tree5 = new Tree();
        for(int x:num5){
            tree5.insert(x);
        }

        traversalOrders(tree5);

    }

    static void traversalOrders(Tree tree){
        System.out.print("Pre-order: ");
        tree.preorder();
        System.out.println();
        System.out.print("In-order: ");
        tree.inorder();
        System.out.println();
        System.out.print("Post-order: ");
        tree.postorder();
        System.out.println();
    }
}

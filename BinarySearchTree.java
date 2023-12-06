public class BinarySearchTree {
    //The public instance variables or fields
    int value;
    int depth;
    BinarySearchTree left;
    BinarySearchTree right;


    //constructor 
    public BinarySearchTree (int value, int depth){
        this.value = value;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }

    //constructor
    public  BinarySearchTree (int value){
        this.value = value;
        this.depth = 1;
        this.left  = null;
        this.right = null;
    }

    //main method
    public static void main(String[] args) {
        
    BinarySearchTree bt = new BinarySearchTree(15);
    System.out.println(bt);
    }

}
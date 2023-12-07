public class BinarySearchTree {
    //created the public instance variables or fields
    public int value;
    public int depth;
    public BinarySearchTree left;
    public BinarySearchTree right;


    // created a constructor that should take two parameters: int value and int depth
    public BinarySearchTree (int value, int depth){
        this.value = value; //set the value of the value equal to the parameter value
        this.depth = depth; //set the value of the depth equal to the parameter depth
        this.left = null; // Set left tree to null.
        this.right = null;// Set right tree to null.
    }

    //Created another constructor that takes one parameter: int value
    public  BinarySearchTree (int value){
        this.value = value; //set the value of the value equal to the parameter value
        this.depth = 1;//set the value of the depth equal to 1
        this.left  = null;// Set left tree to null.
        this.right = null;// Set right tree to null.
    }

    //Defined a public method, .insert(), with an int parameter called value and a return type void
    public void insert(int value){


        // if the value parameter is less than the current node’s value (this.value).
        if (value < this.value) {


            //if a left child node doesn’t exist yet (equal to null)
            if (this.left == null) {

            //If cpndition is met , would set this.left equal to a new BinarySearchTree with the target value and a depth one greater than this.depth.
             this.left = new BinarySearchTree(value,this.depth++);
             System.out.printf("Tree node %d added to the left of %d at depth %d \n", value, this.value, this.depth + 1);

            }
            else {
             //call the .insert() method from the left child, with the same value as the argument if  if the left child exists already.    
            this.left.insert(value);
            }
        } else {

            // if a right child node doesn’t exist yet
            if (this.right == null) {

            //If condition is met , would set this.right equal to a new BinarySearchTree with the target value and a depth one greater than this.depth.
             this.right = new BinarySearchTree(value,this.depth++);
             System.out.printf("Tree node %d added to the right of %d at depth %d \n", value, this.value, this.depth + 1);

            } else {
            
             //call the .insert() method from the right child, with the same value as the argument if  if the right child exists already.    
            this.right.insert(value);   
            }
        }
    }

    //Define a method, .getNodeByValue() that takes one int parameter, value, and returns type BinarySearchTree
    public BinarySearchTree getNodeByValue(int targetValue){
    //if the target value and the root node’s value (this.value) are the same.
     if (this.value == targetValue) {
        return this;// return this node  if the condition is met
     }

     // else if the target value is less than this.value AND the left child node exists
     else if (targetValue < this.value && this.left != null ) {
        // return with a call to .getNodeByValue() method from the left child node.
       return this.left.getNodeByValue(targetValue);
     }

     // else if the target value is greater than this.value AND the right child node exists
     else if(targetValue > this.value && this.right != null){
        // return with a call to .getNodeByValue() method from the right child node.
        return this.right.getNodeByValue(targetValue);
     }
        //add a default return statement that returns null.
        return null;   
    }

    //Definer a public method of return type void, .depthFirstTraversal, that takes no parameters.
    public void depthFirstTraversal(){
        //if the left child node exists
        if (this.left != null) {
         // call this traversal method on the left child node.This traverses the left subtree.  
         this.left.depthFirstTraversal(); 
        }
        //print out the value of the root node. As because we want to look at the root node. We can simply print out the value this contains and the tree level of the root node.
        System.out.println(this.value);

        //if the left child node exists
        if (this.right != null) {
        // call this traversal method on the left child node.This traverses the left subtree.    
         this.right.depthFirstTraversal();
        }
    }
    //main method
    public static void main(String[] args) {
    //create a BinarySearchTree instance called bt with value 15    
    //BinarySearchTree bt = new BinarySearchTree(15);
    //System.out.println(bt);//Print bt‘s value to the output.


    //BinarySearchTree root = new BinarySearchTree(100); // tp be commented out to check the functionality of  the Inserting value
    //root.insert(50);
    //root.insert(125);
    //root.insert(75);
    //root.insert(25);

        // Get nodes by value below
        //System.out.println(root.getNodeByValue(75));// to be commented out to check the fucntionality of the getNodeByValue
        //System.out.println(root.getNodeByValue(55));

    BinarySearchTree tree = new BinarySearchTree(48);
    tree.insert(24);
    tree.insert(55);
    tree.insert(26);
    tree.insert(38);
    tree.insert(56);
    tree.insert(74);

    
    tree.depthFirstTraversal(); //tested out functionality of the depthFirstTraversal


    }

}
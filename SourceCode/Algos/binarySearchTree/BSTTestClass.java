package binarySearchTree;

public class BSTTestClass {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
		
        bst.inorder();

        System.out.println("-------------------------------------------------------");
        bst.deleteKey(80);
        bst.deleteKey(70);
        
        
        bst.inorder();
        
        int minResult =bst.countMinNbrOfNodes(80);
        System.out.println("\nNumber of Nodes Smaller than key:: " + minResult);
        
        int maxResult =bst.countMaxNbrOfNodes(80);
        System.out.println("\nNumber of Nodes Smaller than key:: " + maxResult);
        
	}

	
	
}

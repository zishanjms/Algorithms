package binarySearchTree;

public class BinarySearchTree {

	Node root;
	
	class Node
	{
		public int data;
		public Node right;
		public Node left;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public void insert(int key)
	{
		root = insertRec(root ,key);
	}
	
	private Node insertRec(Node root, int key)
	{
		if(root==null)
		{
			root = new Node(key);
			return root;
		}
		
		if(root.data >= key)
		root.left = insertRec(root.left, key);
		else if(root.data < key)
		root.right = insertRec(root.right, key);
		
		return root;
	}
	
	public void deleteKey(int key){
		root = deleteRec(root, key);
	}
	
	
	public Node deleteRec(Node root, int key){
	
		if(root==null) return root;
		
		if(key < root.data){
			root.left = deleteRec(root.left, key);
		}else if(key > root.data){
			root.right = deleteRec(root.right, key);
		}
		else{
			
			if(root.left == null){
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			
			root.data  = minValue(root.right);
			
			root.right = deleteRec(root.right, root.data);
		}
		return root;
	}
	
	public int minValue(Node root){
		int minV = root.data;
		
		while(root.left!=null){
			minV = root.data;
			root = root.left;
		}
		
		return minV;
	}
	
	public void inorder()
	{
		inorderRec(root);
	}
	
	private void inorderRec(Node root)
	{
		if(root!=null)
		{
			inorderRec(root.left);
			System.out.print(root.data + "\t");
			inorderRec(root.right);
		}
	}
	
	public int countMinNbrOfNodes(int key)
	{
		return countMinNbrOfNodesRec(root, key);
	}
	
	private int countMinNbrOfNodesRec(Node root, int key)
	{
		if(root == null)
			return 0;
		
		int retValue=0;
		int leftvalue = countMinNbrOfNodesRec(root.left, key);
		int rightvalue = countMinNbrOfNodesRec(root.right, key);
		
		if(root.data<key)
			retValue =1;
		
		return leftvalue + rightvalue + retValue;
	}
	
	public int countMaxNbrOfNodes(int key)
	{
		return countMaxNbrOfNodesRec(root, key);
	}
	
	private int countMaxNbrOfNodesRec(Node root, int key)
	{
		if(root == null)
			return 0;
		
		int retValue=0;
		int leftvalue = countMaxNbrOfNodesRec(root.left, key);
		int rightvalue = countMaxNbrOfNodesRec(root.right, key);
		
		if(root.data>key)
			retValue =1;
		
		return leftvalue + rightvalue + retValue;
	}
}

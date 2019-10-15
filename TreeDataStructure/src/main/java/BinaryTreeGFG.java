import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeGFG {
	/* A binary tree node has key, pointer to  
    left child and a pointer to right child */
	static class Node { 
		int key; 
		Node left, right; 

		// constructor 
		Node(int key){ 
			this.key = key; 
			left = null; 
			right = null; 
		} 
	} 

	static Node root; 
	static Node temp = root; 

	/* Inorder traversal of a binary tree*/
	static void inorder(Node temp) 
	{ 
		if (temp == null) 
			return; 

		inorder(temp.left); 
		System.out.print(temp.key+" "); 
		inorder(temp.right); 
	} 

	/*function to insert element in binary tree */
	static void insert(Node temp, int key) 
	{ 
		Queue<Node> q = new LinkedList<Node>(); 
		q.add(temp); 

		// Do level order traversal until we find 
		// an empty place.  
		while (!q.isEmpty()) { 
			temp = q.peek(); 
			q.remove(); 

			System.out.println("Temp "+temp.key);
			if (temp.left == null) { 
				temp.left = new Node(key); 
				break; 
			} else
				q.add(temp.left); 

			if (temp.right == null) { 
				temp.right = new Node(key); 
				break; 
			} else
				q.add(temp.right); 
		} 
	} 



	public static void main(String[] args) {
		root = new Node(10);
		insert(root, 11); 
		insert(root, 12); 
		insert(root, 13); 
		insert(root, 14); 
		insert(root, 15); 
		
		System.out.print("\nInorder traversal after insertion:"); 
		inorder(root); 
	}

}

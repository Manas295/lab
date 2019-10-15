public class BinaryTree {
	// first node
	private Node root;
	BinaryTree(){
		root = null;
	}

	/*
	 * public String toString() {
	 * 
	 * return
	 * "node value:"+root.value+"left::"+root.left+"    sroot.right:   "+root.right;
	 * }
	 */
	// Class representing tree nodes
	static class Node{
		int value;
		Node left;
		Node right;
		Node(int value){
			this.value = value;
			left = null;
			right = null;        
		}
		public void displayData(){
			System.out.print(value + " ");
		}
	}

	public void insert(int i){
		root = insert(root, i);
	}

	//Inserting node - recursive method
	public Node insert(Node node, int value){

		if(node == null){
			return new Node(value);
		}
		// Move to the left if passed value is 
		// less than the current node
		if(value < node.value){
			node.left = insert(node.left, value);
		}
		// Move to the right if passed value is 
		// greater than the current node
		else if(value > node.value){
			node.right = insert(node.right, value);
		}

		return node;
	}
	// Search node in binary search tree
	public Node find(int searchedValue){
		Node current = root;
		while(current.value != searchedValue){
			if(searchedValue < current.value)
				// Move to the left if searched value is less
				current = current.left;
			else
				// Move to the right if searched value is >=
				current = current.right;
			if(current == null){
				return null;
			}
		}
		return current;
	}

	// For traversing in order
	public void inOrder(Node node){
		if(node != null){
			inOrder(node.left);
			node.displayData();
			inOrder(node.right);
		}
	}
	// Preorder traversal
	public void preOrder(Node node){
		if(node != null){
			node.displayData();
			preOrder(node.left);           
			preOrder(node.right);
		}
	}
	// Postorder traversal
	public void postOrder(Node node){
		if(node != null){
			postOrder(node.left);
			postOrder(node.right);
			node.displayData();          
		}
	}

	public boolean delete(int value){
		Node current = root;
		Node parent = root;
		boolean isLeftChild = false;
		while(current.value != value){
			parent = current;
			if(value < current.value){
				// Move to the left if searched value is less
				current = current.left;
				isLeftChild = true;
			}
			else{
				// Move to the right if searched value is >=
				current = current.right;
				isLeftChild = false;
			}
			if(current == null){
				return false;
			}
		}
		// if reached here means node to be deleted is found

		// Leaf node deletion case
		if(current.left == null && current.right == null){
			System.out.println("Leaf node deletion case");
			// if root node is to be deleted
			if(current == root){
				root = null;
			}
			// left child
			else if(isLeftChild){
				parent.left = null;
			}
			// right child
			else{
				parent.right = null;
			}
		}
		// Node to be deleted has one child case
		// Node to be deleted has right child
		else if(current.left == null){
			System.out.println("One right child deletion case");
			// if root node is to be deleted
			if(current == root){
				root = current.right;
			}
			// if deleted node is left child
			else if(isLeftChild){
				parent.left = current.right;
			}
			// if deleted node is right child
			else{
				parent.right = current.right;
			}
		}
		// Node to be deleted has left child
		else if(current.right == null){
			System.out.println("One left child deletion case");
			if(current == root){
				root = current.left;
			}
			// if deleted node is left child
			else if(isLeftChild){
				parent.left = current.left;
			}
			// if deleted node is right child
			else{
				parent.right = current.left;
			}
		}
		// Node to be deleted has two children case
		else{
			System.out.println("Two children deletion case");
			// find in-order successor of the node to be deleted
			Node successor = findSuccessor(current);
			if(current == root){
				root = successor;
			}
			// if deleted node is left child
			else if(isLeftChild){
				parent.left = successor;
			}
			// if deleted node is right child
			else{
				parent.right = successor;
			}
			successor.left = current.left;
		}
		return true;
	}
	// Method to find the in-order successor of the deleted node
	private Node findSuccessor(Node node){
		Node successor = node;
		Node successorParent = node;
		// Start from the right child of the node to be deleted
		Node current = node.right;
		while(current != null){
			successorParent = successor;
			successor = current;
			current = current.left;
		}
		// When In-order successor is in the left subtree 
		// perform two ref changes here as we have 
		// access to successorParent
		if(successor != node.right){
			System.out.println("********************");
			System.out.println(successor.value);
			System.out.println(node.right.value);
			System.out.println("********************");
			successorParent.left = successor.right;
			// applicable only when successor is not right child
			// so doing here
			successor.right = node.right;
		}
		return successor;
	}

	public Node deleteNode_recur(Node node, int value){
		if(node == null)
			return null;
		if(value < node.value){
			node.left = deleteNode_recur(node.left, value);
		}else if (value > node.value){
			node.right = deleteNode_recur(node.right, value);
		}else{
			// Leaf node deletion case
			if(node.left == null && node.right == null){
				System.out.println("Leaf node deletion case");
				node = null;
			}
			// Node to be deleted has one child case
			// Node to be deleted has right child
			else if(node.left == null){
				System.out.println("Having One right child deletion case");
				node = node.right;
			}
			// Node to be deleted has left child
			else if(node.right == null){
				System.out.println("Having One left child deletion case");
				node = node.left;
			}
			// Node to be deleted has two children case
			else{
				System.out.println("Two children deletion case");
				Node successor = findSuccessor_recur(node.right);
				// Copy the value
				node.value = successor.value;
				// delete successor node instead
				node.right = deleteNode_recur(node.right, successor.value);
			}
		}
		return node;
	}
	private Node findSuccessor_recur(Node node){
		if(node.left == null)
			return node;
		else 
			return findSuccessor_recur(node.left);

	}

	// Finding node with min value
	public Node findMinimum(Node node){
		if(node.left != null){
			return findMinimum(node.left);
		}
		return node;
	}
	// Finding node with max value    
	public Node findMaximum(Node node){
		if(node.right != null){
			return findMaximum(node.right);
		}
		return node;
	}

	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		bst.insert(50);
		bst.insert(70);
		bst.insert(30);
		bst.insert(15);
		bst.insert(35);
		bst.insert(7);
		bst.insert(22);
		bst.insert(31);
		/*	System.out.println("Inorder traversal of binary tree");
		bst.inOrder(bst.root);
		System.out.println();
		Node node = bst.find(16);
		System.out.println((node == null)? "Node not found" : String.valueOf(node.value));
		System.out.println("Preorder traversal of binary tree");
		bst.preOrder(bst.root);
		System.out.println();
		System.out.println("Postorder traversal of binary tree");
		bst.postOrder(bst.root);
		System.out.println();*/

		System.out.println("Inorder traversal of binary tree");
		bst.inOrder(bst.root);
		System.out.println();
		/*boolean deleteFlag = bst.delete(35);
		boolean deleteFlag = bst.delete(15);*/
	/*	boolean deleteFlag = bst.delete(30);
		if(deleteFlag)
			System.out.println("Node successfully deleted");
		System.out.println("Inorder traversal after deletion");
		bst.inOrder(bst.root);
		System.out.println();*/

		Node minNode = bst.findMinimum(bst.root);
		Node maxNode = bst.findMaximum(bst.root);
		System.out.println("Minimum node value- " + minNode.value);
		System.out.println("Maximum node value- " + maxNode.value);

		/* Recursive method call
		 newRoot = bst.deleteNode_recur(bst.root, 15);
		 bst.inOrder(newRoot); 
		 */
	}
}
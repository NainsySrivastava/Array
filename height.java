import java.util.LinkedList; 
import java.util.Queue; 
class Node 
{ 
	int data; 
	Node left, right; 

	Node(int item) 
	{ 
		data = item; 
		left = right; 
	} 
} 

class BinaryTree 
{ 
	Node root; 
	int treeHeight(Node node) 
	{ 
		// Base Case 
		if (node == null) 
			return 0; 
		Queue<Node> q = new LinkedList(); 
		q.add(node); 
		int height = 0; 

		while (1 == 1) 
		{ 
			int nodeCount = q.size(); 
			if (nodeCount == 0) 
				return height; 
			height++; 
			while (nodeCount > 0) 
			{ 
				Node newnode = q.peek(); 
				q.remove(); 
				if (newnode.left != null) 
					q.add(newnode.left); 
				if (newnode.right != null) 
					q.add(newnode.right); 
				nodeCount--; 
			} 
		} 
	} 
	public static void main(String args[]) 
	{ 
		BinaryTree tree = new BinaryTree();  
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		System.out.println("Height of tree is " + tree.treeHeight(tree.root)); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 

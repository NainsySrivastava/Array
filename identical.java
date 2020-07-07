/* Iterative Java program to check if two */
import java.util.*; 
class Main { 

// A Binary Tree Node 
static class Node 
{ 
	int data; 
	Node left, right; 
} 

// Iterative method to find height of Binary Tree 
static boolean areIdentical(Node root1, Node root2) 
{ 
	// Return true if both trees are empty 
	if (root1 == null && root2 == null) return true; 

	// Return false if one is empty and other is not 
	if (root1 == null || root2 == null) return false; 

	// Create an empty queues for simultaneous traversals 
	Queue<Node > q1 = new LinkedList<Node> (); 
	Queue<Node> q2 = new LinkedList<Node> (); 

	// Enqueue Roots of trees in respective queues 
	q1.add(root1); 
	q2.add(root2); 

	while (!q1.isEmpty() && !q2.isEmpty()) 
	{ 
		// Get front nodes and compare them 
		Node n1 = q1.peek(); 
		Node n2 = q2.peek(); 

		if (n1.data != n2.data) 
		return false; 

		// Remove front nodes from queues 
		q1.remove(); 
		q2.remove(); 

		/* Enqueue left children of both nodes */
		if (n1.left != null && n2.left != null) 
		{ 
			q1.add(n1.left); 
			q2.add(n2.left); 
		} 

		// If one left child is empty and other is not 
		else if (n1.left != null || n2.left != null) 
			return false; 

		// Right child code (Similar to left child code) 
		if (n1.right != null && n2.right != null) 
		{ 
			q1.add(n1.right); 
			q2.add(n2.right); 
		} 
		else if (n1.right != null || n2.right != null) 
			return false; 
	} 

	return true; 
} 

// Utility function to create a new tree node 
static Node newNode(int data) 
{ 
	Node temp = new Node(); 
	temp.data = data; 
	temp.left = null; 
	temp.right = null; 
	return temp; 
} 

// Driver program to test above functions 
public static void main(String[] args) 
{ 
	Node root1 = newNode(1); 
	root1.left = newNode(2); 
	root1.right = newNode(3); 
	root1.left.left = newNode(4); 
	root1.left.right = newNode(6); 

	Node root2 = newNode(1); 
	root2.left = newNode(2); 
	root2.right = newNode(3); 
	root2.left.left = newNode(4); 
	root2.left.right = newNode(5); 

	if(areIdentical(root1, root2) == true) 
	System.out.println("Yes"); 
	else
	System.out.println("No"); 
} 
} 

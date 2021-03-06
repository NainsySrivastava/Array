import java.util.*;
class Main
{
	static class Node{
		int data;
		Node left, right;
	}
	static int getLeafCount(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		Queue<Node> q = new LinkedList<>();
		int count =0;
		q.add(node);
		while(!q.isEmpty())
		{
			Node temp = q.peek();
			q.poll();
			if(temp.left != null)
			{
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				q.add(temp.right);
			}
			if(temp.left == null && temp.right == null)
			{
				count++;
			}
		}
		return count;
	}
	static Node newNode(int data)
	{
		Node node = new Node();
		node.data = data;
		node.left = node.right = null;
		return (node);
	}
	public static void main(String[] args)
	{
		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.left.right = newNode(5);
		System.out.println(getLeafCount(root));
	}
}

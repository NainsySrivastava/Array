class Node
{
	int data;
	Node left, right;
	Node(int item)
	{
		data = item;
		left = right = null;
	}
}
class BinaryTree
{
	Node root;
	boolean hadPathsum(Node node, int sum)
	{
		if(node == null)
			return sum == 0;
		return hadPathsum(node.left, sum - node.data)||hadPathsum(node.right , sum - node.data);
	}
	public static void main(String[] args)
	{
		int sum = 21;
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(4);
		tree.root.right.left = new Node(2);
		if(tree.hadPathsum(tree.root, sum))
			System.out.println("there is a root to leaf path sum");
		else
			System.out.println("there is no root to leaf path sum");
	}
}

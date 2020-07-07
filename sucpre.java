import java.util.*;
class Main
{
	static class Node{
		int key;
		Node left, right;
	};
	static Node pre;
	static Node suc;
	static void findpresuc(Node root, int key)
	{
		if(root == null)
			return;
		while(root != null)
		{
			if(root.key == key)
			{
				suc = root.right;
				while(suc.left != null)
					suc = suc.left;
			}
			if(root.left != null)
			{
				pre = root.left;
				while(pre.right != null)
					pre = pre.right;
			}
			return;
		}
		else if(root.key < key)
		{
			pre = root;
			root = root.right;
		}
		else{
			suc = root;
			root = root.left;
		}
		else{
			suc = root;
			root = root.left;
		}
	}
}
static Node newNode(int item)
{
	Node temp = new Node();
	temp.key = item;
	temp.left = temp.right = null;
	return temp;
}
static Node insert(Node node, int key)
{
	if(node == null)
		return newNode(key);
	if(key < node.key)
		node.left = insert(node.left, key);
	elsenode.right = insert(node.right, key);
	return node;
	public static void main(String[] args)
	{
		int key = 65;
		Node root = null;
		root = insert(root, 50);
		insert(root, 60);
		insert(root, 70);
		insert(root, 80);
		insert(root, 85);
		insert(root, 90);
		insert(root, 85);
		findpresuc(root, key);
		if(pre != null)
			System.out.println("preorder is"+pre.key);
		else
			System.out.println("-1");
if(suc != null)
System.out.println("successor is"+suc.key);
else
System.out.println("-1");
	}
}	
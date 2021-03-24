package demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 This implementation of a BST makes the following assumptions:
 1) Data stored in nodes are of type Integer
 2) No duplicate values are inserted. 
 */
public class MyBST {
	private Node root;
	int size = 0;

	//start with an empty tree
	public MyBST() {
		root = null;
	}
	public int size(){
		return size;
	}
	public boolean find(Integer x) {
		if(x==null) return false;
		return find(x,root);
	}	
	public boolean remove(Integer val) {
		
		Node node = findNode(val,root);
		return removeNode(node);
	}
	
	public int leafNodes(){
		return leafNodes(root);
	}
	private int leafNodes(Node p)
	{
	int count = 0;
	if( p != null)
	{ if((p.left == null) && (p.right == null))
	count = 1;
	else
	count = count + leafNodes(p.left)
	+ leafNodes(p.right);
	}
	return count;
	}
	public void insert(Integer x) {
		if (root == null) {
			root = new Node(x, null, null);
			size++;
		}
		else {
			Node n = root;
			boolean inserted = false;
			while(!inserted){
				if(x.compareTo(n.data)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new Node(x,null,null);
						inserted = true;
						size++;
					}
					else {
						n = n.left;
					}
				}
				
				else if(x.compareTo(n.data)>0){ 
					//space found on the right					
					if(n.right==null){
						n.right = new Node(x,null,null);
						inserted = true;
						size++;
					}
					else {
						n = n.right;
					}
				}
                else { //duplicate value
                    throw new IllegalArgumentException("Duplicate value passed in!");
                }
				
			}

		}
	}	
	
	

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}
	
	public void printAsDiagram() {
		BTreePrinter printer = new BTreePrinter();
		printer.printNode(root);
	}
	
	public List asList() {
		
		return asList(new LinkedList(), root);
		
		
	}
	public void preOrder(){
		preOrder(root);
	}
	private void preOrder(Node p) {
		if (p != null) {
			System.out.print(p.data + " ");
			preOrder(p.left);
			preOrder(p.right);
		}
	}

	public void postOrder(){
		postOrder(root);
	}
	private void postOrder(Node p) {
		if (p != null) {
			postOrder(p.left);
			postOrder(p.right);
			System.out.print(p.data + " ");
		}
	}

	///////// PRIVATE METHODS ///////////////

	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.data);
			printTree(t.right);
		}
	}
	private List asList(List theList, Node t) {
		if(theList == null) return theList;
		if(t == null) return theList;
		if(t != null) {
			asList(theList,t.left);
			theList.add(t.data);
			asList(theList,t.right);
		}
		return theList;
	}
	private boolean removeNode(Node node) {
		if(node == null) return false;
		//in this case, we can just break the link
		//from node to its parent
		if(node.left == null && node.right== null) {
			Node parent = parent(node);
			if(parent != null) {
				if(parent.left == node) parent.left = null;
				if(parent.right == node) parent.right = null;
			}
			node = null;
			size--;
			return true;
		}
		//in these cases, add a link from parent to 
		//child of node
		if( node.left != null && node.right == null ){
			Node parent = parent(node);
			if(parent.left == node) parent.left = node.left;
			if(parent.right == node) parent.right = node.left;
			node = null;
			size--;
			return true;
		}
		if( node.left == null && node.right != null ){
			Node parent = parent(node);
			if(parent.left == node) parent.left = node.right;
			if(parent.right == node) parent.right = node.right;
			node = null;
			size--;
			return true;
		}	
		
		//in this case, find min to the right of node and
		//insert this value into the node; link up parent of this min with right child
		//of this min
		
		
		if(node.left != null && node.right != null) {
			Node min = findMinNode(node.right);
			Node parentOfMin = parent(min);
			node.data = min.data;			
			parentOfMin.right = min.right;
			size--;
			return true;
		}
		return false;
	}
	private Node parent(Node t) {
		return parent(t,root,null);
	}
	private Node parent(Node t, Node n, Node parent) {
		
		if(n == null) return null;
		Integer val = t.data;
		
		
		if(n.data.equals(val)) return parent;
		if(val.compareTo(n.data)<0) {
			return parent(t,n.left, n);
		}
		else {
			return parent(t,n.right,n);
		}
	}
	private Node findNode(Integer val) {
		return findNode(val,root);
	}
	private Node findNode(Integer val,Node n) {
		if(n == null) return null;
		if(n != null && n.data.equals(val)) return n;
		if(val.compareTo(n.data)<0) {
			return findNode(val,n.left);
		}
		else {
			return findNode(val,n.right);
		}
	}
	public Integer findMin() {
		return findMin(root);
	}
	private Integer findMin(Node t) {
		Node s = findMinNode(t);
		return s.data;
	}
	
	private Node findMinNode(Node t) {
		if(t==null) return null;
		while(t.left != null) {
			t = t.left;
		}
		return t;
	}
	
	public Integer findMax(){
		return findMax(root);
	}
	private Integer findMax(Node p)
	{
		Node current,last=null;
		current = p;
		while(current!=null)
		{
			last = current;
			current = current.right;
		}
		return last.data;
	}
	

	private boolean find(Integer x, Node n){
		if(n == null) return false;
		if(n.data.equals(x)) return true;
		return (x.compareTo(n.data) < 0) ?
				find(x,n.left) :
				find(x,n.right);
		
	}
	
	public Integer getRoot(){
		if(root.data==null) {
			System.out.println("Tree is Empty");
			return -1;}
		else{
		return root.data;
		}
	}
	
	
	public static void main(String[] args){
		MyBST bst = new MyBST();
		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(12);
		bst.insert(26);
		bst.insert(13);
		
		bst.printAsDiagram();
		System.out.println("Leaf node count : " +bst.leafNodes());
		System.out.println("Minimum Value : " + bst.findMin());
		System.out.println("Maximum Value : " + bst.findMax());
		System.out.println("Pre Order Traversal : ");
		bst.preOrder();
		System.out.println("\nPost Order Traversal : ");
		bst.postOrder();
		System.out.println("\nCurrent Size : " + bst.size());
		bst.remove(26);
		bst.remove(12);
		bst.remove(15);
		
		
		bst.insert(21);
		bst.insert(24);
		bst.insert(22);
//		System.out.println(bst.asList());
		//bst.printTree();
		System.out.println();
		bst.remove(26);
		
		bst.printTree();
		bst.printAsDiagram();
		System.out.println("\nCurrent Size : " + bst.size());
		
	}

	class Node {

		// Constructors
		Node(Integer theElement) {
			this(theElement, null, null);
		}

		Node(Integer element, Node left, Node right) {
			this.data = element;
			this.left = left;
			this.right = right;
		}
		public String toString() {
			return data.toString();
		}
		private Integer data; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}
	
	static class BTreePrinter {

	    public static void printNode(Node root) {
	        int maxLevel = BTreePrinter.maxLevel(root);

	        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	    }

	    private static void printNodeInternal(List nodes, int level, int maxLevel) {
	        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
	            return;

	        int floor = maxLevel - level;
	        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
	        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
	        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

	        BTreePrinter.printWhitespaces(firstSpaces);

	        List newNodes = new ArrayList();
	        for (Object node : nodes) {
	            if (node != null) {
	                System.out.print(((Node)node).data);
	                newNodes.add(((Node)node).left);
	                newNodes.add(((Node)node).right);
	            } else {
	                newNodes.add(null);
	                newNodes.add(null);
	                System.out.print(" ");
	            }

	            BTreePrinter.printWhitespaces(betweenSpaces);
	        }
	        System.out.println("");

	        for (int i = 1; i <= endgeLines; i++) {
	            for (int j = 0; j < nodes.size(); j++) {
	                BTreePrinter.printWhitespaces(firstSpaces - i);
	                if (nodes.get(j) == null) {
	                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
	                    continue;
	                }

	                if (((Node)nodes.get(j)).left != null)
	                    System.out.print("/");
	                else
	                    BTreePrinter.printWhitespaces(1);

	                BTreePrinter.printWhitespaces(i + i - 1);

	                if (((Node)nodes.get(j)).right != null)
	                    System.out.print("\\");
	                else
	                    BTreePrinter.printWhitespaces(1);

	                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
	            }

	            System.out.println("");
	        }

	        printNodeInternal(newNodes, level + 1, maxLevel);
	    }

	    static void printWhitespaces(int count) {
	        for (int i = 0; i < count; i++)
	            System.out.print(" ");
	    }

	    static int maxLevel(Node node) {
	        if (node == null)
	            return 0;

	        return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
	    }

	    static boolean isAllElementsNull(List list) {
	        for (Object object : list) {
	            if (object != null)
	                return false;
	        }

	        return true;
	    }
	}
}
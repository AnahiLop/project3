/** 
 * Class definition for a Node of a singly linked list
 */
public class Node {

	public int value;
	// (100, $10)
	public double price;
	public Node next;
	
	/** 
	 * Constructor: creates a node with the given element and next Node. 
	 */
	public Node(int a, double e, Node n) {
		value = a;
		price = e;
		next = n;
	}
}
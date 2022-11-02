public class Queue{
	private Node head;
	private int size;
	private Node tail;

	public Queue(){
		head = null;
		tail = null;
		size = 0;
	}
	public void display(){
		Node cur = head;
		for(int i = 0; i < size; i++){
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
	}

	//hello

	public void enqueue(int val){
		Node v = new Node(val,null);
		if (head == null){
			head = v;
			tail = v;
			//System.out.println("hello");
		}
		else{
			tail.next = v;
			tail = tail.next;
		}
		size++;
	}
	public long dequeue(){
		long temp = head.value;
		head = head.next; 
		size --; 
		if (size == 0){
			tail = null;
		}
		return temp;
	}
	public int front(){
		return head.value;
	}
	public boolean Empty(){
		if(size == 0){
			return true;
		}
		return false;
	}
	public int size(){
		return size;
	}
}

class QueueTest{
	public static void main(String[] args){
		Queue a = new Queue();
		// a.enqueue(57);
		// //System.out.println("check1");
		// //a.display();
		// a.enqueue(70);
		// //a.display();
		// a.enqueue(0);
		// //System.out.println("check2");
		// a.display();
		// System.out.println("Original List");
		// a.dequeue();
		// a.display();
		// System.out.println("New List");
		// a.front();
		// System.out.println("Front");
		// a.Empty();
		// System.out.println("Empty?");
		// a.size();
		// System.out.println("size");

		a.buy(3, 2.00);
		a.display();
	}
}

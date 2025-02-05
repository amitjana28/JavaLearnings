package linkedlistInJava;

public class FindMiddle {
	
	static int listLength(Node head) {
		int count =0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	
	static int middleElement(Node head) {
		int midIdx = listLength(head)/2;
		Node curr = head;
		while(midIdx>0) {
			curr = curr.next;
			midIdx--;
		}
		return curr.data;
	}
	
	static int midElement(Node head) {
		Node slwPtr = head;
		Node fstPtr = head;
		
		while(fstPtr!=null && fstPtr.next!=null) {
			fstPtr = fstPtr.next.next;
			slwPtr = slwPtr.next;
		}
		
		return slwPtr.data;
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(50);
		head.next.next.next.next = new Node(60);
		head.next.next.next.next.next = new Node(80);
		
		System.out.println(midElement(head));

	}

}

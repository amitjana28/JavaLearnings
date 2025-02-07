package linkedlistInJava;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedList {
	
	static boolean searchList(Node head, int target) {
		while(head!=null) {
			if(head.data==target)
				return true;
			head = head.next;
		}
		return false;
	}

	static int listLength(Node head) {
		int count = 0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	
	static void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	static Node addStart(Node head, int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
		}
		
		newNode.next = head;
		return newNode;
	}
	
	static Node delStart(Node head) {
		if(head==null) {
			System.out.println("Empty List");
			return head;
		}
		return head.next;
	}
	
	static Node addLast(Node head, int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
		}
		Node currNode = head;
		while(currNode.next!=null) {
			currNode = currNode.next;
		}
		currNode.next=newNode;
		return head;
	}
	
	static Node delLast(Node head) {
		if(head==null) {
			System.out.println("Empty List");
			return head;
		}
		
		if(head.next==null) {
			head=null;
			return head;
		}
		Node currNode = head;
		while(currNode.next.next!=null) {
			currNode = currNode.next;
		}
		currNode.next=null;
		return head;
	}
	
	static Node addSpecific(Node head, int data, int pos) {
		if(pos<1) {
			System.out.println("Invalid position");
			return head;
		}
		
		if(pos==1) {
			Node newNode = new Node(data);
			newNode.next = head;
			return newNode;
		}
		
		Node prev = head;
		int count =1;
		
		while(count<pos-1 && prev!=null) {
			prev=prev.next;
			count++;
		}
		
		Node newNode = new Node(data);
		newNode.next = prev.next;
		prev.next=newNode;
		return head;
	}
	
	static Node delSpecific(Node head, int pos) {
		if(pos<1 || head==null) {
			System.out.println("Invalid position");
			return head;
		}
		
		if(pos==1) {
			return head.next;
		}
		
		Node curr = head;
		for(int i=1;i<pos-1&&curr!=null;i++) {
			curr=curr.next;
		}
		
		curr.next=curr.next.next;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		
		System.out.println(listLength(head));
		printList(head);
		
		head = addStart(head,70);
		System.out.println(listLength(head));
		printList(head);
		
		head = addLast(head,80);
		System.out.println(listLength(head));
		printList(head);
		
		head = addSpecific(head,92,3);
		System.out.println(listLength(head));
		printList(head);
		
		head = delStart(head);
		System.out.println(listLength(head));
		printList(head);
		
		head = delLast(head);
		System.out.println(listLength(head));
		printList(head);
		
		head = delSpecific(head,4);
		System.out.println(listLength(head));
		printList(head);

	}

}

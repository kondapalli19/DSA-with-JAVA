/**
 * 
 */
package linkedList;

import linkedList.NthNodeFromEnd.Node;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MergeTwoSortedLists {
	public static Node mergeWithoutSpace(Node list1, Node list2) {
		Node t1=list1;
		Node t2=list2;
		Node h=new Node(100);
		Node t=h;
		while(t1!=null && t2!=null) {
			if(t1.data<t2.data) {
				t.next=t1;
				t=t1;
				t1=t1.next;
			}
			else {
				t.next=t2;
				t=t2;
				t2=t2.next;
			}
		}
		if(t1==null) {
			t.next=t2;
		}
		else {
			t.next=t1;
		}
		return h.next;
	}
	public static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node mergeWithSpace(Node list1, Node list2) {
		Node temp1 = list1;
		Node temp2 = list2;
		Node head = new Node(100);
		Node temp = head;
		while (temp1 != null && temp2 != null) {
			if (temp1.data < temp2.data) {
				Node a = new Node(temp1.data);
				temp.next = a;
				temp = a;
				temp1 = temp1.next;
			} else {
				Node a = new Node(temp2.data);
				temp.next = a;
				temp = a;
				temp2 = temp2.next;
			}
		}
		if (temp1 == null) {
			temp.next = temp2;
		} else {
			temp.next = temp1;
		}
		return head.next;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a1 = new Node(1);
		Node b1 = new Node(3);
		Node c1 = new Node(5);
		Node d1 = new Node(8);
		a1.next = b1;
		b1.next = c1;
		c1.next = d1;

		Node a2 = new Node(2);
		Node b2 = new Node(4);
		Node c2 = new Node(6);
		Node d2 = new Node(7);
		a2.next = b2;
		b2.next = c2;
		c2.next = d2;

		Node temp = mergeWithSpace(a1, a2);
		Node temp1 = mergeWithoutSpace(a1, a2);
//		display(a1);
//		display(a2);
		display(temp);
		display(temp1);

	}

}

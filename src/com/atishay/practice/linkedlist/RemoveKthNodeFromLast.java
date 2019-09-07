package com.atishay.practice.linkedlist;

//O(n): Runtime
//Using 2 Pointer Technique
//One is fast Pointer and 2nd is Last pointer
//Used while removing Nth node from last.
public class RemoveKthNodeFromLast {
	public static void main(String[] args) {
		// 1,2,3,4,5 : remove 2nd node from last

		// special case: remove 5th node from last, in this case
		// head needs to be changed
		ListNode head = new ListNode(1);
		ListNode lst2 = new ListNode(2);
		head.next = lst2;
		ListNode lst3 = new ListNode(3);
		lst2.next = lst3;
		ListNode lst4 = new ListNode(4);
		lst3.next = lst4;
		ListNode lst5 = new ListNode(5);
		lst4.next = lst5;
		lst5.next = null;

		// change the node no to be deleted from last.
		head = removeNthFromEnd(head, 5);

		while (head.next != null) {
			System.out.println(head.val);
			//Needs to take next element otherwise
			//infinite loop.
			head = head.next;
		}
	}

	// Assuming next Method will be present
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head;
		ListNode slow = head;
		int start = 1;

		ListNode currentNode = null;

		while (fast.next != null) {
			fast = fast.next;
			start++;

			// Slow pointer will start after fast pointer reaches n
			if (start > n) {
				// This node will be marked as currentNode
				// Or as a previous node of the node to be deleted.
				currentNode = slow;
				slow = slow.next;
			}
		}

		// Special Case when head needs to be deleted
		// or when n == length of linkedList
		// or last element need to be deleted from last
		if (currentNode == null) {
			head = slow.next;
		} else {
			currentNode.next = slow.next;
		}
		return head;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}

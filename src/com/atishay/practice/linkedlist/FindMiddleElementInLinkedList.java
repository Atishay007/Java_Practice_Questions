package com.atishay.practice.linkedlist;

/**
 * 
 * Space Complexity:O(1). RunTime Complexity:O(n).
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * 
 * Using 2 pointer technique.
 *
 */
public class FindMiddleElementInLinkedList {
	public static void main(String[] args) {
		// [1,2,3,4,5]
		// Output: Node 3
	}

	static ListNode middleNode(ListNode head) {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		boolean incSlowPointer = false;

		// edgeCase for 1 element and 2 element in list.
		if (head.next == null) {
			return head;
		} else if (head.next.next == null) {
			return head.next;
		}

		// This is important condition, same type is used in
		// Detect Loop/Cycle in LinkedList but with extra condition.
		while (fastPointer.next != null) {

			if (incSlowPointer) {
				slowPointer = slowPointer.next;
			}
			// Increase SlowPointer for second time.
			incSlowPointer = true;

			if (fastPointer.next.next != null) {
				fastPointer = fastPointer.next.next;
			} else {
				fastPointer = fastPointer.next;
			}
		}
		return slowPointer.next;
	}
}
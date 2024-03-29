# linked-list cycle
For problem description:https://leetcode.com/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-interview-150
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null  )
        {
            return false;
        }
        ListNode curr=head.next;
       /* if(curr.next==head)
        {
            return true;
        }
        else
       /* {
            return false;
        }*/

        
        ListNode hare=head;
        ListNode turtle=head;
        while(hare.next!=null&&hare!=null&& hare.next.next!=null)
        {
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle)
           { return true;}
        }
        return false;
        
    }
}

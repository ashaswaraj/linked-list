problem statement:https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem?isFullScreen=true
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
        
       
        if(head==null)
        {
            head=newnode;
            return head;
        }
        SinglyLinkedListNode curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newnode;
        return head ;
    }

package linkedlist;

public class newlistuc1 {
	static class LinkedList
	{
	    Node head;  // head of list
	 
	    /* Linked list Node*/
	    class Node
	    {
	        int data;
	        Node next;
	        Node(int d) {data = d; next = null; }
	    }
	 
	    /* Inserts a new Node at front of the list. */
	    public void push(int new_data)
	    {
	        /* 1 & 2: Allocate the Node &
	                  Put in the data*/
	        Node new_node = new Node(new_data);
	 
	        /* 3. Make next of new Node as head */
	        new_node.next = head;
	 
	        /* 4. Move the head to point to new Node */
	        head = new_node;
	    }
	 
	    /* Inserts a new node after the given prev_node. */
	    public void insertAfter(Node prev_node, int new_data)
	    {
	        /* 1. Check if the given Node is null */
	        if (prev_node == null)
	        {
	            System.out.println("The given previous node cannot be null");
	            return;
	        }
	 
	        /* 2 & 3: Allocate the Node &
	                  Put in the data*/
	        Node new_node = new Node(new_data);
	 
	        /* 4. Make next of new Node as next of prev_node */
	        new_node.next = prev_node.next;
	 
	        /* 5. make next of prev_node as new_node */
	        prev_node.next = new_node;
	    }
	    public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.data+" ");
	            tnode = tnode.next;
	        }
	    }
	    public static void main(String[] args)
	    {
	        /* Start with the empty list */
	        LinkedList llist = new LinkedList();
	        llist.push(70);
	        llist.push(30);
	        llist.push(56);
	        System.out.println("\nthe created list is: ");
            llist.printList();
	    }

		
		}
}
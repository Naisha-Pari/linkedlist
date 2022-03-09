package linkedlist;
import java.util.*;

import java.util.LinkedList;

public class removelist {
	      
	    /* Driver Code */  
	    public static void main(String ar[])  
	    {  
	        /* Implementing LinkedList using a stack representation. */  
	        LinkedList<Integer> listStack = new LinkedList<>();  
	        /* Adding an element into stack. */  
	        listStack.push(70);  
	        listStack.push(56);  
	        listStack.push(30);  
	        System.out.println("Linked List after adding new elements: " + listStack);  
	        /* Deleting an element from stack. */  
	        System.out.println("Deleted element 1: " + listStack.pop());  
	        /* Adding an element into stack. */  
	        listStack.push(80);  
	        /* Displaying the complete stack. */  
	        System.out.println("New Linked List: " + listStack);  
	    }  
}
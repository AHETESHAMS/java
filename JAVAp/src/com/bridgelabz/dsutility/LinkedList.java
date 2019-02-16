/**
 * Class Node: Contains Two objects one will hold Data of String Type 
 * other will hold address of another node of type node.
 * 
 * class LinkedList: Contains functions to operate the LinkedList.  
 *
 */
package com.bridgelabz.dsutility;
//class Node: Contains structure of Node
class Node
{
	String data;
	Node next;
}
//class LinkedList: Contains structure of structure of LinkedList
public class LinkedList
	{
		Node head = null;
		//It is function that performs insert node operation
		public void insertAtLast(String data)
		{
			Node node = new Node();
			node.data = data;
			if(head == null)
			{
				head = node;
				node.next = null;
			}
			else
			{
				Node n = head;
				while(n.next!=null)
				{
					n = n.next;
				}
				node.next = null;
				n.next = node;
			}
		}
		//It is a function That performs delete node operation
		public void delete(String element)
		{
			Node n = head;
			Node prev = head;
			if(n.data.equals(element)) {
				head = n.next;
				return;
			}
			while(n.next!=null)
			{			
				if(element.equals(n.data))
				{
					prev.next = n.next;
					return;
				}
				prev = n;
				n=n.next;
			}
			prev.next = null;
		}
		public void sortList()
		{
			System.out.println("In sor fun");
			Node n = head;
			Node prev;
			prev=n.next;
			while(n.next!=null)
			{
				while(prev.next!=null)
				{
					System.out.println("In loop");
					if (n.data.compareTo(prev.data) < 0) 
		    		{
						System.out.println(n.data+" and "+prev.data+" are sorted");
						System.out.println("In if");
		    			String t = n.data;
		    			n.data =prev.data;
		    			prev.data = t;
		    		}
					prev=prev.next;
				}	
				n=n.next;
				prev=n.next;
			}
		}
		//It is a Function which displays Linked List 
		public void show()
		{
			Node n = head;
			while(n.next!=null)
			{
				System.out.print(n.data+" ");
				n = n.next;
			}
			System.out.println(n.data);
		}
		
		public String get()
		{
			Node n = head;
			if(n.next==null) {
				head=null;
				return n.data;
			}
			head=n.next;
			return n.data;
		}

		public boolean isEmpty() {
			if(head==null) {
				return true;
			}
			return false;
		}

}


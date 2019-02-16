package com.bridgelabz.dsutility;

public class Queue {
	
			int front,rear,size;
			int capacity;
			int array[];
			char charArray[];
			public Queue(int capacity)
			{
				this.capacity = capacity;
				front = this.size = 0;
				array = new int[this.capacity];
			}
			public boolean isFull(Queue queue)
			{
				return(queue.capacity == queue.size);
			}
			public boolean isEmpty(Queue queue)
			{
				return(queue.size == 0);
			}
			public boolean enqueue(int item)
			{
				if(isFull(this))
					return true;
				else
				{
					this.rear = (this.rear+1)%this.capacity;
					this.array[this.rear] = item;
					this.size = this.size+1;
					return false;
				}
			}	
			public void dequeue()
			{
				if(isEmpty(this))
					System.out.println("Queue is Empty!");
				else
				{	
					this.front = (this.rear+1)%this.capacity;
					int item = this.array[this.front];
					this.size = this.size-1;
				}	
			}
			public char dequeue()
			{
				char item; 
				if(isEmpty(this))
					
				else
				{
					this.front = (this.rear+1)%this.capacity;
					item = this.charArray[this.front];
					this.size = this.size-1;
					return item;
				}
				
			}
			public int front() 
		    { 
		        if (isEmpty(this)) 
		            return Integer.MIN_VALUE; 
		           
		        return this.array[this.front]; 
		    } 
			public int rear() 
		    { 
		        if (isEmpty(this)) 
		            return Integer.MIN_VALUE; 
		           
		        return this.array[this.rear]; 
		    } 

}

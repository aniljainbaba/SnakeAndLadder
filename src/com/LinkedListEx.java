package com;

public class LinkedListEx <T> {
	
	//inner node class
	class Node <T>{
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
		}
	}
	
	Node start = null;
	Node current = null;
	
	/**
	 * Append to last
	 * @param data
	 */
	public void appendToTail(T data) {
		Node newNode = new Node(data);
		
		if(start == null) {
			start = newNode;
			return;
		}
		current = start;
		while(current.next != null) {
			System.out.println(current);
			current = current.next ;
			
		}
		current.next = newNode;
		
	}//end appendToTail
	
	public void display() {
		System.out.println("------");
		current = start;
		while(current != null) {
			System.out.print(current.data +  "->");
			current =  current.next;
		}
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			LinkedListEx <Integer>obLinkedList = new LinkedListEx<Integer>();
			  obLinkedList.appendToTail(10);
			  obLinkedList.appendToTail(20);
			  obLinkedList.appendToTail(30);
			  obLinkedList.appendToTail(40);
			 
			obLinkedList.display();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}//end main

}//end class

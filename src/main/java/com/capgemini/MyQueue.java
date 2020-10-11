package com.capgemini;

public class MyQueue {
	private MyLinkedList myLinkedList;
	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}
	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}
	public void displayQueue() {
		myLinkedList.printMyNodes();
	}
}

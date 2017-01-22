import java.util.NoSuchElementException;
import java.util.LinkedList;

public class Queue{
	private static class Node{
		Node next;
		int val;
	}
	private Node head;
	private Node tail;
	Queue(){
	}
	public  void enqueue(int x){
		if(isEmpty()){
			Node node= new Node();
			node.val=x;
			head=node;
			tail=node;
		}
		else{
		Node node= new Node();
		node.val=x;
		node.next=head;
		head=node;
		}
	}
	public  void dequeue(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		if(head.next==null){
			head=null;
			tail=null;
		}
		else{
		Node runner=head;
		while(runner.next!=null && runner.next!=tail){
			runner=runner.next;
		}
		tail=runner;
		runner.next=null;
		}
	}
	public  int peek(){
		if(isEmpty()){
		throw new NoSuchElementException();
		}
		return tail.val;
	}
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	public String toString(){
		String total="";
		Node runner=head;
		while(runner!=null){
			total+=String.valueOf(runner.val);
			runner=runner.next;
		}
		return total;
	}
}
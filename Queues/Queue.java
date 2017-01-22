import java.util.NoSuchElementException;
import java.util.LinkedList;
public class Queue{
	private LinkedList <Integer> linkedlist;
	Queue(){
		linkedlist=new LinkedList <Integer>();
	}
	public  void enqueue(int x){
		linkedlist.addLast(x);
	}
	public  int dequeue(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		int temp=linkedlist.getFirst();
		linkedlist.remove();
		return(linkedlist.getFirst());

	}
	public  int peek(){
		int temp=linkedlist.getFirst();
		return temp;

	}
	public boolean isEmpty(){
		if(linkedlist.size()==0){
			return true;
		}
		return false;
	}
	public String toString(){
		String total="";
		for(int i=0; i<linkedlist.size(); i++){
			total+=linkedlist.get(i);
		}
		return total;
	}
}
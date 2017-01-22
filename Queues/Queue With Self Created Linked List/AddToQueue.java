import java.util.Scanner;
import java.util.NoSuchElementException;

public class AddToQueue{
	public static void main(String [] args){
		Queue queue=new Queue();
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(2);
		queue.enqueue(9);
		System.out.print(queue.toString()+"\n");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.print(queue.toString()+"\n");
		queue.dequeue();
		System.out.println(e);
		System.out.print(queue.toString()+"\n");


	}
}
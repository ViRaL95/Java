
import java.util.EmptyStackException;
public class Stack{

private static class StackNode{
	int value;
	StackNode next;

	StackNode(int value){
		this.value=value;
	}
}
StackNode head;

public void push(int x){
	if(isEmpty()){
		head=new StackNode(x);
	}
	else{
		StackNode node= new StackNode(x);
		node.next=head;
		head=node;
	}


}
public int pop(){
	if(isEmpty()){
		throw new EmptyStackException();
	}
	int temp=head.value;
	head=head.next;
	return temp;

}

public  int peek(){
	if(isEmpty()){
		throw new EmptyStackException();
	}
		return head.value;
	
}
public boolean isEmpty(){
	if(head==null)
		return true;
	return false;
}

public String toString(){
	StackNode temp=head;
	String value="";
	while(temp!=null){
		value+=Integer.toString(temp.value);
		temp=temp.next;
	}
	return value;
}
}
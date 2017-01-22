import java.util.LinkedList;
import java.util.Date;
public class Queue{
	private LinkedList <Animal> catlist;
	private LinkedList <Animal> doglist;

	Queue(){
		catlist=new LinkedList<Animal>();
		doglist= new LinkedList<Animal>();
	}

	public void enqueue(Animal animal){
		if(animal instanceof Cat)
			catlist.addLast(animal);
		if(animal instanceof Dog)
			doglist.addLast(animal);
	}

	public void dequeueCat(){
		if(catlist.size()!=0){
			int i=0;
			catlist.removeFirst();
		}
	}

	public void dequeueDog(){
		if(doglist.size()!=0){
			int i=0;
			doglist.removeFirst();			
		}
	}

	public void dequeueAny(){
		if(catlist.size()!=0 && catlist.peek().getDate().before(doglist.peek().getDate())){
			catlist.removeFirst();
		}
		else if(doglist.size()!=0 && doglist.peek().getDate().before(catlist.peek().getDate())){
			doglist.removeFirst();
		}
	}
	public String toString(){
		String total="";
		for(int i=0; i<catlist.size(); i++){
			total+=catlist.get(i).getName();
			total+="\n";
		}
		for(int i=0; i<doglist.size(); i++){
			total+=doglist.get(i).getName();
			total+="\n";
		}
		return total;
	}
}
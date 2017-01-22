import java.util.Date;
public class CatsAndDogs{
public static void main (String [] args){
	Cat cat1=new Cat("Manjit", "brown", new Date(1));
	Cat cat2= new Cat("Sunjay","white", new Date(2));
	Dog dog1=new Dog("Debduth", "black", new Date(3));
	Dog dog2= new Dog("Aatif","grey", new Date(4));
	Queue queue=new Queue();
	queue.enqueue(cat1);
	queue.enqueue(cat2);
	queue.enqueue(dog1);
	queue.enqueue(dog2);	
	System.out.println(queue.toString());
	queue.dequeueAny();
	System.out.println(queue.toString());
	queue.dequeueDog();
	System.out.println(queue.toString());

}
}
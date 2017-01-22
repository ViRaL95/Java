public class Main{
	public static void main (String [] args){
		HashMap hashmap= new HashMap();
		hashmap.put("Jordan", 10);
		hashmap.put("Varun", 23);
		hashmap.put("Nurav",18);
		System.out.println("Jordan's value is "+hashmap.get("Jordan"));
		System.out.println("Nurav's value is "+hashmap.get("Nurav"));
		System.out.println("Varun's value is "+hashmap.get("Varun"));	
	}
}
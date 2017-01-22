public class HashNode{
	private String key;
	private int value;

	HashNode(String key, int value){
		this.key=key;
		this.value=value;
	}

	public String getKey(){
		return key;
	}
	public int getValue(){
		return value;
	}
}
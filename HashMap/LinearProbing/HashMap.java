public class HashMap{
	private final int TABLE_SIZE=16;
	HashNode [] table;
	HashMap(){
		 table= new HashNode[TABLE_SIZE];

	}
	public void put(String key, int value){
		int hash=0;
		for (int i=0; i<=key.length()-1; i++){
			hash+=(int)key.charAt(i);
		}
		System.out.println("hash is "+hash);		
		hash=hash%TABLE_SIZE;
		System.out.println("hash after is"+hash);
		while(table[hash]!=null){
			hash=(++hash)%TABLE_SIZE;
		}
		table[hash]=new HashNode(key, value);
	}
	public int get(String key){
		int hash=0;
		for(int i=0; i<=key.length()-1; i++){
			hash+=(int)key.charAt(i);
		}
		hash=hash%TABLE_SIZE;

		while(table[hash].getKey()!=key){
			hash=(++hash)%TABLE_SIZE;
		}
		return table[hash].getValue();
	}


}
public class HashMap{
	private final int TABLE_SIZE=16;
	HashNode [] table;

	private class HashNode{
		private String key;
		private int val;
		private HashNode next;

		public HashNode(String key, int val){
			this.key=key;
			this.val=val;
		}
		public int getVal(){
			return this.val;
		}
		public String getKey(){
			return this.key;
		}
		public void setKey(String key){
			this.key=key;
		}
		public void setVal(int val){
			this.val=val;
		}
	}	

	public HashMap(){
		 table= new HashNode[TABLE_SIZE];
	}

	public void put(String key, int value){
		int hash=0;
		for(int i=0; i<=key.length()-1; i++){
			hash+=(int)key.charAt(i);
		}
		System.out.println("hash is "+hash);		
		hash=hash%TABLE_SIZE;
		HashNode head=table[hash];
		HashNode newnode= new HashNode(key, value);
		if(head==null){
			table[hash]=newnode;
		}
		else{
			while(head.next!=null){
				head=head.next;
			}
			head.next=newnode;
		}
	}	
	public int get(String key){
		int hash=0;
		for (int i=0; i<=key.length()-1; i++){
			hash+=(int)key.charAt(i);
		}
		System.out.println("hash is "+hash);				
			hash=hash%TABLE_SIZE;
			HashNode head=table[hash];
			if(head==null){
				return -1;
			}			
			while(head!=null && head.getKey()!=key){
				head=head.next;
			}
			if(head.getKey()==key){
			return head.getVal();
			}
			return -1;
	}
}
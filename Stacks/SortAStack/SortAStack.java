
public class SortAStack{
	public static void main (String [] args){
		Stack stack= new Stack();
		stack.push(1);
		stack.push(9);
		stack.push(2);
		stack.push(8);
		stack.push(4);	
		System.out.println(stack.toString());
		Stack helperstack= new Stack();
		while(!stack.isEmpty()){
			if(helperstack.isEmpty()){

				helperstack.push(stack.pop());
			}
			else{
				int value=stack.pop();
				int counter=0;

				while(!helperstack.isEmpty()&&helperstack.peek()>value){
					stack.push(helperstack.pop());
					counter++;
				}
				helperstack.push(value);
				while(counter>0){
					helperstack.push(stack.pop());
					counter--;
				}
			}
		}
		System.out.println(helperstack.toString());

	}
}


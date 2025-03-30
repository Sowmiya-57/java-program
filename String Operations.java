\\String Operations
\\stack implementation in java
class stack{
\\store elements of stack
	Private int arr[];
\\represents top of stack
	Private int top;
\\total capacity of the stack 
	private int capacity;
\\creating a stack
	Stack(int size){
\\initialize the array
\\initialize the stack varaiables
	arr=new int[size];
	capacity=Size:
	top=-1
	}
\\push elements to the top of the stack 
	Public void push(int x){
	if (is full()){
	System.out.println("Stack.Overflow");
\\terminate the program
	System.exit(1):
	}
\\insert elements on top of stack
	System.out.println("Inserting"+x);
	arr[++top]=x;
	}
\\pop the elements from top of the stack
	Public int pop(){
\\if stack is empty
\\no element to pop
	if(is Empty()){
	System.out.println("Stack Empty"):
\\terminate the program 
	System.exit(1):
	}
\\pop the element from the top of the stack
	return top+1:
\\return size of the stack
	Public Boolean id full()
	return top==capacity-1;
	}
\\display elements of the stack
	Public void print stack(){
	for (int i=0;i<top;i++){
	System.out.println(arr[i]+",");
	}
}
	Pulic static void main(String[]args){
	Stack=new stack(5);
	stackh(1);
	stackh(2);
	stack(3);
	Syatem.out.print("Stack:");
	stack.print stack();
\\remove the elements from the stack
	stack pop();
	System.out.println("\n After Poppingout");
	stack.printstack();
	}
}




	


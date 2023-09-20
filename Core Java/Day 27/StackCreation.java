// stack implementation in java

public class StackPushPop{
	//store elements of stack
	private int arr[];

	//represent top of stack
	private int top;

	//total capacity of the stack
	private int capacity;

	//creating  a stack
	Stack(int size){
	//initialize the array
	//initialize the stack variable
	arr = new int[size];
	capacity = size;
	top = -1;
	}

	//push element to the top of stack
	public void push(int x){
		if(isFull()){
			System.Out.println("Stack Overflow");

			//terminate the program
			System.exit(1);
		}
		//insert elemennt in top of stack
		System.Out.println("Inserting " + x);
		arr[++top] = x;

	}
	//pop element of top of stack
	public int pop(){
		//if stack is empty
		//no element to pop
		if(isEmpty()){
			System.Out.println("STACK EMPTY");

			//terminate the program
			System.exit(1);
		}
		//pop element from top of stack
		return arr[top--];
	}
	//return size of the stack
	public int getSize(){
		return top + 1;
	}
	//check if the stack is empty
	public Boolean isEmpty(){
		return top = -1;
	}

	//check if the stack is full
	public Boolean isFull(){
		return top = capacity - 1;
	}

	//display element of stack
	public void printStack(){
		for(int 1 = 0; i<=top; i++){
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.print("Stack: ");
		stack.printStack();

		//remob=ve element from stack
		stack.pop();
		System.out.println("\nAfter poppint out");
		stack.printStack();
	}

}
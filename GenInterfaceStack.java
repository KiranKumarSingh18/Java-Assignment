package generic;

interface GenDemo<T>
{
	void addFirst(T element);
	void append(T element);
	boolean searchElement(T element);
	
}

class Stack<T> implements GenDemo<T>
{
	T[] stack;
	int index =-1;
	public Stack(T[] stack) {
		this.stack = stack;
	}
	
	public boolean isFull() {
		if(index == 9)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(index == -1)
			return true;
		return false;
	}
	
	
	
	public void append(T element) {
		stack[++index] = element;
	}
	
	public void push(T element) {
		if(!isFull()) {
			append(element);
		}
		else
			System.out.println("Stack is full");
	}
	
	public void pop() {
		if(!isEmpty()){
			System.out.println(stack[index--]);
		}
		else
			System.out.println("Stack Underflow");
	}
	
	public void addFirst(T element) {
		if(!isFull()) {
			
			for(int i =index++ ; i>=0;i--) {
				stack[i+1] = stack[i];
			}
			stack[0] = element;
		}
	}
	
	public boolean searchElement(T element) {
		for(int i =0; i <= index; i++) {
			if(stack[i] == element)
				return true;
		}
		return false;
	}
}

class StringStack implements GenDemo<String>
{
	String[] stack;
	int index =-1;
	public StringStack(String[] stack) {
		this.stack = stack;
	}
	
	public boolean isFull() {
		if(index == 9)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(index == -1)
			return true;
		return false;
	}
	
	
	
	public void append(String element) {
		stack[++index] = element;
	}
	
	public void push(String element) {
		if(!isFull()) {
			append(element);
		}
		else
			System.out.println("Stack is full");
	}
	
	public void pop() {
		if(!isEmpty()){
			System.out.println(stack[index--]);
		}
		else
			System.out.println("Stack Underflow");
	}
	
	public void addFirst(String element) {
		if(!isFull()) {
			
			for(int i =index++ ; i>=0;i--) {
				stack[i+1] = stack[i];
			}
			stack[0] = element;
		}
	}
	
	public boolean searchElement(String element) {
		for(int i =0; i <= index; i++) {
			if(stack[i] == element)
				return true;
		}
		return false;
	}
}
public class GenAssTest {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>(new Integer[10]);
		
		for(int i =1;i<9;i++)
			s.push(i*10);
		
		s.addFirst(100);
		for(int i = 0;i<10;i++) {
			s.pop();
		}
		
		StringStack ss = new StringStack(new String[10]);
		for(int i =1;i<9;i++)
			ss.push(i+" Welcome");
		
		ss.addFirst("100  Welcome");
		for(int i = 0;i<10;i++) {
			ss.pop();
		}
		

	}

}

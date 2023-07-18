package generic;

public class List<T> 
{
	private T[] list; 
	private int front=-1;;
	private int back=-1;
	
	
	public List(T[] list) {
		this.list = list;
	}
	
	public boolean isFull() {
		if(back==list.length-1)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(back ==-1)
			return true;
		else
			return false;
	}
	
	public void addAtBegining(T element) {
		if(back==-1) {
			append(element);
		}
		else {
			if(!(isFull())) {
				int tempInd = back;
				T temp = list[back];
				list[++back] = temp;
				for(int i = tempInd;i>0;i--) {
					list[i]=list[i-1];
				}
				list[0] = element;
			}
			else
				System.out.println("List is full.. add at begin is not possible");
		}
	}
	
	public void append(T element) {
		if(!(isFull())) 
			list[++back] = element;
		else
			System.out.println("List is full");
	}
	
	public void insertAtPosition(int position, T element)
	{
		if(!(isFull())){
			int tempInd = back;
			T temp = list[back];
			list[++back] = temp;
			for(int i = tempInd;i>position;i--) {
				list[i]=list[i-1];
			}
			list[position] = element;
		}
		else
			System.out.println("List is full... add at position is not posible");
	}
	
	public void deleteFromEnd() {
		if(!isEmpty()) {
			System.out.println( list[back--]);
		}
		else
			System.out.println("List is Empty....");
	}
	
	public void deleteFirst() {
		if(!isEmpty()) {
			System.out.println(list[0]);
			for(int i =0;i<back;i++) {
				list[i] = list[i+1];
			}
			back--;
			
		}
		else
			System.out.println("no elements to delete in begining");
	}
	
	public void deleteElement(T element) {
		if(!isEmpty()) {
			for(int i =0;i<= back;i++) {
				if(list[i]== element) {
					System.out.println(list[i]+ " at index "+i+" is deleted");
					for(int j =i;j<back;j++) {
						list[j] = list[j+1];
					}
					back--;
				}
			}
		}
		
	}
	
	public void printList() {
		for(int i =0;i<=back;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
}


public class GenericListTest {
	public static void main(String[] args) {
		List<Integer> l1 = new List<Integer>(new Integer[10]);
//		System.out.println(l1.isEmpty());
		for(int i =1;i<=10;i++)
			l1.addAtBegining(i * 10);
		l1.printList();
//		l1.printList();
////		l1.addAtBegining(1000);
//		l1.deleteFromEnd();
//		l1.deleteFromEnd();
//		l1.deleteFromEnd();
//		System.out.println();
//		l1.deleteFirst();
//		System.out.println();
//		l1.deleteElement(30);
//		l1.printList();
//		
////		l1.addAtBegining(1000);
////		l1.printList();
//		l1.insertAtPosition(2, 500);
//		l1.printList();
	}
}

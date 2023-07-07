// Stack - 11
import java.util.Scanner;

public class Stack
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int top = -1;
		int[] stack = new int[10];
		while(true){
		    
		    int ch = sc.nextInt();
		    
		    
		    if(ch == 1){
		        if(top<9){
		            top = top+1;
		            System.out.println("Enter: ");
		            stack[top] = sc.nextInt();
		        }
		        else{
		            System.out.println("Stack overflow");
		        }
		    }
		    else if(ch == 2){
		        if(top>-1){
		            System.out.println(stack[top]+" poped");
		            top=top-1;
		        }
		        else{
		            System.out.println("Stack underflow");
		        }
		    }
		    else if(ch == 3){
		        if(top==-1){
		            System.out.println("True");
		        }
		        else{
		            System.out.println("False");
		        }
		    }
		    else if(ch == 4){
		        if(top == 9){
		            System.out.println("True");
		        }
		        else{
		            System.out.println("False");
		        }
		    }
		    else{
		        System.out.println("Terminated..");
		        break;
		    }
		    
		}
	}
}

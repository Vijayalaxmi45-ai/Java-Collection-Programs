import java.util.Stack;
class StackExample
{
	public static void main(String args[])
	{
		//Creation of Stack
		Stack<Integer> s = new Stack<>();
		
		//Pushing elements of stack using push() method
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		//fetching all once
		System.out.println("Elements of Stack "+s);
		
		//poping element of stack
		s.pop();	
		
		//printing after poping element
		System.out.println("After poping 1st index element "+s);
		
		//peek of stack
		System.out.println("Peak of Stack "+s.peek());
	}
}
package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
//		stack = LIFO data structure. Last in First out
//		stores object into sort of "vertical tower"
//		push() to add object to the top
//		pop() to remove object from the top
		
		Stack<String> stack= new Stack<String>();
		
//		to check stack is empty or not
		System.out.println(stack.isEmpty());
		
//		adding an object to the stack
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack);
		
//		remove top item of the stack
//		pop() always remove top item of the stack
//		EmptyStackException -> if stack is empty and u r trying to pop
//		String myFavGame= stack.pop();
		
		
//		peek() return top item of the stack without removing 
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
//		search() -> return position of the object from top of the stack starting position is 1
//		otherwise return -1
		System.out.println(stack.search("DOOM"));
		
//		java.lang.OutOfMemoryError: Java heap space
//		for(int i=0; i<1000000000; i++) {
//			stack.push("Fallout76");
//		}
			
		System.out.println(stack);
		
//		uses of stack?
//		1. undo/redo features in text editor
//		2. moving backward/forward through browser history
//		3. backtracking algorithm (maze, file directories)
//		4. calling functions (call stack)
	}
}

package at.fhj.itm;

import java.util.Vector;

/**
 * Stack Implementation of <code>Stack</code> Interface. supports String Values
 * and can be initialized with a maximum number of items.
 * 
 * @see Stack
 */
public class StringStack implements Stack {
	int index = 0;
	Vector<String> stack;

	public StringStack() {
		stack = new Vector<String>();
	}
	/**
	 * Tests if this stack is empty.
	 * @return false or true 
	 */
	@Override
	public boolean isEmpty() {
		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}

	}
	
	
	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * if Stack is full return an error message
	 * 
	 * @param item
	 * 
	 */
	public void push(String item) {
		stack.addElement(item);

	}

	/**
	 * Removes the object at the top of this stack and returns that
	 * object as the value of this function.
	 * 
	 * if Stack is empty return an error message
	 */
	public String pop() {
		if(isEmpty() == false){
			String element = stack.get(stack.size() - 1);
		stack.removeElementAt(stack.size() - 1);
		return element ;
		}else {
			return null;
		}
		
	}
}

import java.util.Stack;

import kr.or.kosa.MyStack;

public class Ex05_Stack_Queue {

	public static void main(String[] args) {
		// JAVA API �����ϴ� Ŭ����
		// Javascript�� �迭�� stack�� �� : push�� pop ��� �Ȱ���!!
		
		// LIFO 
		Stack stack = new Stack(); 
		stack.push("A");
		stack.push("B");
		stack.push("C"); 
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		// C, B, A
		System.out.println(stack.empty()); // stack�� ����ִ��� ��� //true
		
		// �������̽� , �ڵ��� ȭ��(��ȯ) , ��ź���� �� ..
		
		MyStack mystack = new MyStack(2);
		System.out.println(mystack.isEmpty());
		mystack.push(1);
		mystack.push(3);
		System.out.println(mystack.isEmpty());
		System.out.println(mystack.pop());
		System.out.println(mystack.isfull());
	}

}

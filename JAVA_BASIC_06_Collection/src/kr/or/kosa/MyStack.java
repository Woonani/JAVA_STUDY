package kr.or.kosa;

//JAVA API �����ϴ� stack ���� �����غ���
//LIFO ������ �ڵ� ....
//1. stack ������� (Array : �����迭 10����), ������� Ÿ�� (Object)
//2. ��ġ���� : ����Ǵ� ���� �ִ� ��ġ (index) hint)������ǰ ���� cart ����ؼ� ó�� 
//3. ��� : push() , pop() , boolean empty() ,boolean full()

public class MyStack {
	private Object[] stackarr; // �����
	private int top;
	private int maxsize;
	
	
	public MyStack(int maxsize) {
		this.stackarr = new Object [maxsize];
		this.top = -1;
		this.maxsize = maxsize;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isfull() {
		return (top == this.maxsize-1);
//		if(top == this.maxsize-1) {
//			return true;
//		}
//		return false;
	}
	public void push(Object i) {
		if(isfull()) {
//			throw new IndexOutOfBoundsExceoption("���ܹ߻�");
			System.out.println("mystack is full ....");
		}else {
			this.stackarr[++top]=i;
		}
	}
	
	public Object pop() {
		Object value = null;
		if(isEmpty()) {
			System.out.println("mystack is empty ....");
		}else {
			value = this.stackarr[top--];
		}
		
		return value;
	}
}

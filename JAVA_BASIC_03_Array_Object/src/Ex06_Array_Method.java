class Human{
	String name;
}

class OverClass{
	int add (int i , int j ) {
		return i + j;
	}
	void add(Human human) { // Human Ÿ���� �ּҰ��� �־��ָ� �Ǵ� ����***************** add(new Human())
		System.out.println(human.name);
	}
	// 1. add(new Human());
	// 2. Human h = new Human(); add(h);
	// �ݵ�� �ؾ� �մϴ�^^
	
	//�迭�� ��ü�� == �迭�� Ÿ���̴�.
	int add(int param) {
		return param + 100;
	}
	
	int[] add(int[] params) {// �ּҰ� �޴´��� // add(String ... values) >> add(1,2,3), add(1,2)
		// int[] arr = {1,2}    add(arr) // �迭Ÿ���� �ּҰ�
		// ���� �ڵ� ������ ����
//		 add (new 
		int[] target = new int [params.length];
		for(int i = 0; i< target.length; i++) {
			target[i] = params[i] + 1;
		}
		return target; // �ּҰ�(heap���ִ� int[] target �迭 �ּ�)
//		return null; // ���ø޸𸮿� �����Ǵ� �� null �� ���� �� �ִ�. (�迭 ���� �� heap ���� null�� ������)
		
		// *������ �ڵ� �Ҷ� ���� null �ϴ� ���� �س��� �ڵ��۾��ϱ�*
	}
}


public class Ex06_Array_Method {

	public static void main(String[] args) {
		OverClass overt = new OverClass();
		int[] source = {10,20,30,40,50};
		int[] ta = overt.add(source);
		for(int value : ta) {
			System.err.println(value);
			
		}
		
	}


}


public class Ex02_Exception {

	public static void main(String[] args) {
		System.out.println("main start");
		int num = 100;
		int result = 0;
		
		// ������ �ǽɵǸ� ... ������ ...
		try {
			for ( int i = 0; i< 10; i++) {
				result = num /(int) (Math.random()*10); //0~9 ����
				System.out.println("result : " + result + " i : "+ i);
			}
			
		}catch(ArithmeticException e) { //Exception e [��������]�� ������ (������)
			System.out.println("���� �߻��߾�� ^^ �����ڿ��� �˷��ּ���");
			System.out.println("���� : "+ e.getMessage());
		}finally{
			System.out.println("main end");
			
		}

	}

}

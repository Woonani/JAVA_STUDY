/*
 ����
 1. ����(error)	: ��Ʈ��ũ ���, �޸� ����, �ϵ���� >> �����ڰ� �ڵ������� �ذ� �Ұ�
 2. ����(exception) : �������� �ڵ� �Ǽ��� �߻� >> ���� �߻� �ڵ� ã�Ƽ� >> ���� >> ����
 2.1 ������ �� ... �������� ���� �ȵǿ� (������ �ذ�)
 2.2 ��Ÿ�ӽ� (���� ����)�� ������ �߻� >> ���� ���� >> ������ ���� ���� >> ���� ������ �ڵ� ����ȵ�
 
 ����ó�� : ���α׷��� ���������� ���� >> ���� ���κм� >> �ڵ���� .... >> �ٽ� ����
 
 try{
 	>> ������ �ǽɵǴ� �ڵ�
 	>> ������ �߻��Ǹ� >> ����� >> ���ܰ� �߻��� ������ ���� �� �ִ� ��ü�� �ڵ����� 
 	ex)
 	>> [0][1][2]	>> car[3] = "" >> ArrayIndexOutOfBoundsException (����) >> ���ܴ��
 	>> new ArrayIndexOutOfBoundsException("����")
 }catch(Exception e){ // Exception ��� ������ �θ�Ÿ�� ( ArrayIndexOutOfBoundsException�� �θ�Ŭ������ Exception �̹Ƿ� ��������!)
 		>> ���� �ľ� 
 		>> ó�� (�ڵ� �������� �ʾƿ�) ����
 		>> 1. ������ email
 		>> 2. �αױ�� (��� �߻� ���)
 		>> 3. ��������� ���´� 
 }finally{
 		>> ������ �߻��Ǵ�, �߻����� �ʴ� ���������� ����Ǵ� �ڵ�
 		// �Լ� return ������ ����.. return�� ������ finally ���� ����
 		>> DB�۾� ...DB�ڿ� ����(����) ���� ....
 }
 */
public class EX01_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("main start");
		System.out.println(0/0);
		//  java.lang.ArithmeticException: / by zero
		// ������ �߻��ϸ� ���� ... �� �̻� �ڵ� �������� �ʾƿ�
		System.out.println("main end");
		 
		 */
		try {
			System.out.println("main start");
			System.out.println(0/0);

		}catch(Exception e) { // �θ�Ÿ�� ������ �ڽ�Ÿ���� �ּҰ��� ���� �� �ִ�. (������)
			// �����ľ� .. ����
			System.out.println("�����߻� > "+ e.getMessage());  	
			e.printStackTrace();
			/*
			 java.lang.ArithmeticException: / by zero at EX01_Exception.main(EX01_Exception.java:41)

			 */

	}
			//finally {
			System.out.println("main end");

//		}
	}

}

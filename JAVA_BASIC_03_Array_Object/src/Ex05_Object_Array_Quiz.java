import kr.or.kosa.dto.Emp;

public class Ex05_Object_Array_Quiz {
	public static void main(String[] args) {
		/*
		 ��� 3���� ���弼�� 
		 �� Array ����ϼ���
		 ����� ����
		 1000, ȫ�浿
		 2000, ������
		 3000, ������
		
		2. ������ for������ ����� �̸��� ��� ����ϼ���
		
		 */
		
//		Emp[] emps = new Emp[3];
//		emps[0] = new Emp(1000, "Ȧ�浿");
//		emps[1] = new Emp(2000, "������");
//		emps[2] = new Emp(3000, "������");
		
//		Emp[] emps = new Emp[] {new Emp(1000, "Ȧ�浿"),new Emp(2000, "������"),new Emp(3000, "������")}; 
		
		// ���� ���� ���
		Emp[] emps = {new Emp(1000, "Ȧ�浿"),new Emp(2000, "������"),new Emp(3000, "������")}; 
		
		for(Emp emp : emps) {
			emp.empInfoPrint();
		}
		
	}
}

import java.util.Scanner;

public class Ex07_String_Total_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ 13�ڸ��� �Է��� �ּ���. ");
		System.out.println("����) 123456-1234567");
		System.out.printf(": ");
		String jumin = sc.nextLine();
		System.out.println();
		int n = Integer.parseInt(jumin.substring(7,8));
		checkNumber(jumin);
		checkBackNumber(n);
		checkGender(n);
	}
	
	// 1. �ڸ��� üũ (���)�Լ� (14 ok)  return true , false
	public static boolean checkNumber(String jumin) {
		return (jumin.length() == 14) ? true:false;
	}
	
	//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�  return true, false
	public static boolean checkBackNumber(int n) {
		return (n>0 && n<5)?true: false;
	}
	
	//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�  void  ���
	public static void checkGender(int n) {
		String gender = (n == 1 || n == 3) ? "����" : "����";
		System.out.println(gender);
	}
}

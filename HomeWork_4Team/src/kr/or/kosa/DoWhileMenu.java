package kr.or.kosa;

import java.util.Scanner;

public class DoWhileMenu {
	Scanner sc = new Scanner(System.in);
//	private String studentName;
//	private int studentGrade;
//	 
//	// �Լ�) ���� ������ �Է� ���
//	public void inputRecord () {
//		 
//	}
//	// �Լ�) ���� ������ ����
//	public void deleteRecord () {
//		
//	}
//	// �Լ�) ���� ������ ����
//	public void sortRecord () {
//		
//	}
	
	public int displayMenu() {
		System.out.println("*******************");
		System.out.println("*******�����Ǳ�*******");
		System.out.println("*******************");
		System.out.println("**  @   **   #   **");
		System.out.println("**  |   **   |   **");
		System.out.println("**1.��� **2.ī���̼�**");
		System.out.println("*******************");
		System.out.println("**  &   **   ^   **");
		System.out.println("**  |   **   |   **");
		System.out.println("**3.����ȭ**4.��ȭ  **");
		System.out.println("*******************");
		System.out.println("**************   **");
		System.out.println("*******************");
//		System.out.println();
//		System.out.println("1.��ǰ����");
//		System.out.println();
//		System.out.println("2.�ɸ�����");
//		System.out.println();
//		System.out.println("3.������ �޴�");
		System.out.println();
		System.out.println("**��ȣ�� ���� ��ǰ�� �������ּ���**");
//		System.out.println("4.���α׷� ����"); // ���߿� ������ �޴��� �ֱ�
//		System.out.println();
		int menuNum = Integer.parseInt(sc.nextLine());
		
		return menuNum;
		
		

	}
	
	


}
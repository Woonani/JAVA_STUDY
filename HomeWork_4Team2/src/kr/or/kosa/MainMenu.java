package kr.or.kosa;

import java.util.Scanner;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	 
	// �Լ�) ��ǰ���� ���
	public void flowerMenu () {
	}
	// �Լ�) �ɸ����� ���
	public void flowerMeaning () {
		
	}
	// �Լ�) ������ ���
	public void administer () {
		
		
	}
	
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
		System.out.println("1.��ǰ����");
		System.out.println("2.�ɸ�����");
		System.out.println("3.������ �޴�");
		System.out.printf(">��ȣ�� ���� �޴��� �������ּ���. \n : ");
//		System.out.println("4.���α׷� ����"); // ���߿� ������ �޴��� �ֱ�
//		System.out.println();
		int menuNum = Integer.parseInt(sc.nextLine());
		
		return menuNum;
		
		

	}
	
	


}
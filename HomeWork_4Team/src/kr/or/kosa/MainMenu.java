package kr.or.kosa;

import java.util.Scanner;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
//	 Payment payment = new Payment();
	// �Լ�) ��ǰ���� ���
	public void buyFlower (Flower flower1, Flower flower2, Flower flower3, Flower flower4, int selectedFlower) {
		int price;
		int payment;
		switch(selectedFlower) {
		case 1 : 
			System.out.printf("�����Ͻ� 1.%s�� %d�� �Դϴ�. �ݾ��� �����Ͽ� �ֽʽÿ�. : ",flower1.getFlowerName(), flower1.getFlowerPrice());
			price = flower1.getFlowerPrice();
			payment = Integer.parseInt(sc.nextLine());
			Payment.payMoney(price, payment);
			break;
		case 2 :
			System.out.printf("�����Ͻ� 2.%s�� %d�� �Դϴ�. �ݾ��� �����Ͽ� �ֽʽÿ�. : ",flower2.getFlowerName(), flower2.getFlowerPrice());
			price = flower2.getFlowerPrice();
			price = flower1.getFlowerPrice();
			payment = Integer.parseInt(sc.nextLine());
			Payment.payMoney(price, payment);
			break;
		case 3 :
			System.out.printf("�����Ͻ� 3.%s�� %d�� �Դϴ�. �ݾ��� �����Ͽ� �ֽʽÿ�. : ",flower3.getFlowerName(), flower3.getFlowerPrice());
			price = flower3.getFlowerPrice();
			price = flower1.getFlowerPrice();
			payment = Integer.parseInt(sc.nextLine());
			Payment.payMoney(price, payment);
			break;
		case 4 :
			System.out.printf("�����Ͻ� 4.%s�� %d�� �Դϴ�. �ݾ��� �����Ͽ� �ֽʽÿ�. : ",flower4.getFlowerName(), flower4.getFlowerPrice());
			price = flower4.getFlowerPrice();
			price = flower1.getFlowerPrice();
			payment = Integer.parseInt(sc.nextLine());
			Payment.payMoney(price, payment);
			break;
		default : 
			System.out.println("����");
			
		}
//		int payment = Integer.parseInt(sc.nextLine());
//		Payment.payMoney(price, payment);
	}
	// �Լ�) �ɸ����� ���
	public void flowerMeaning () {
		
	}
	// �Լ�) ������ ���
	public void administer () {
		
		
	}
	
	public int displayMenu(Flower flower1, Flower flower2, Flower flower3, Flower flower4) {
		System.out.println("*******************");
		System.out.println("*******�����Ǳ�*******");
		System.out.println("*******************");
		System.out.println("**  @   **   #   **");
		System.out.println("**  |   **   |   **");
		System.out.println("**1."+flower1.getFlowerName()+" **2."+flower2.getFlowerName()+"**");
		System.out.println("*******************");
		System.out.println("**  &   **   ^   **");
		System.out.println("**  |   **   |   **");
		System.out.println("**3."+flower3.getFlowerName()+"**4."+flower4.getFlowerName()+"  **");
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
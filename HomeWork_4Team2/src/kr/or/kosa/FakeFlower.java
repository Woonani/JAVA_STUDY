package kr.or.kosa;
import java.util.Scanner;
/*
Ŭ������ �����Ͻôµ�
���� ������ �Է� ���
���� ������ ���� ���
���� ������ ���� ����� ������ �Լ��� ����ð�� (�Լ� �̸��� �����ϰ� �������� ������)

		System.out.println("************");
		System.out.println("***��������***");
		System.out.println("1.�л����� �Է�");
		System.out.println();
		System.out.println("2.�л����� ����");
		System.out.println();
		System.out.println("3.�л����� �̸��� ����");
		System.out.println();
		System.out.println("4.���α׷� ����");
		System.out.println();
�� ������ ������ �Լ��� �����Ͻð� �Լ��� ������ �޴� ��ȣ�� �Ͻð�
�� ��ȣ 1 , 2 , 3 , 4 �� �ԷµǸ� ���õ� ���� �����ϰ� �ϰ�
�׷��� ������ ��������� ���� �Է¹ް� �ϴ� �Լ��� �����ϼ���


������ DoWhileMenu Ŭ������ �ٸ� 
Ex15_DoWhileMenu�� main �Լ����� �����ϸ�
   DoWhileMenu Menu = new DoWhileMenu();
	while(true) {
			switch (Menu.displayMenu()) {
			case 1: Menu.inputRecord();
				break;
			case 2: Menu.deleteRecord();
				breakMenu
			case 3: ex17.sortRecord();	
			    break;
			case 4: System.out.println("���α׷� ����");
			    //return;  >> main �Լ� ����
			    System.exit(0); //���α׷� ����(kill)
			}
		}
����� ���� �� �ֽ��ϴ�

*/
public class FakeFlower {
	Payment payment = new Payment();
	Scanner sc = new Scanner(System.in);
	int price;
	
	public void buyFlowerMenu(int flowerNum) {
		switch(flowerNum) {
		case 1 : 
			System.out.printf("1.��̴� 9550�� �Դϴ�. \n ������ �������ּ��� : ");
			price = 9550;
			break;
		case 2 : 
			System.out.printf("2.ī���̼��� 12800�� �Դϴ�. \n ������ �������ּ���");
			price = 12800;
			break;
		case 3 : 
			System.out.printf("3.����ȭ�� 17000�� �Դϴ�. \n ������ �������ּ���");
			price = 17000;
			break;
		case 4 : 
			System.out.printf("4.��ȭ�� 5000�� �Դϴ�. \n ������ �������ּ���");
			price = 5000;
			break;
		}
		payment.payMoney(price, Integer.parseInt(sc.nextLine()));
		
		
	
}

	

}

package kr.or.kosa;
//import kr.or.kosa.FakeFlowerVendingMachine;

import java.util.Scanner;

public class FakeFlowerVendingMachine {
	
	public static void main(String[] args) {
		// �ɻ���
		Flower flower1 = new Flower("���", 9550, "");
		Flower flower2 = new Flower("ī���̼�", 9550, "");
		Flower flower3 = new Flower("����ȭ", 9550, "");
		Flower flower4 = new Flower("��ȭ", 9550, "");
		// �޴�����
		MainMenu mainMenu = new MainMenu();
		Payment payment = new Payment();

		Scanner sc = new Scanner(System.in);
		
		// �޴����α׷�����
		while(true) {
			switch(mainMenu.displayMenu(flower1, flower2, flower3, flower4)) {
			case 1 : 
				System.out.printf("�����Ͻ� ��ǰ ��ȣ�� ����ּ��� : ");
				int selectedFlower = Integer.parseInt(sc.nextLine());
				mainMenu.buyFlower(flower1, flower2, flower3, flower4, selectedFlower);
			break;
//			case 2 : flowerMachine.flowerInfo();
//			break;
			case 3 : mainMenu.administer();
			break;
			case 10302 : 
				System.out.println("���α׷� ����");
			//return; >> main �Լ� ����
				System.exit(0); // ���α׷� ����(kill) ??  �̰� �� �ȵ�
				break;
			default : 
				System.out.println("��ȣ�� �ٽ� �Է����ּ���");
			}
		}
		
		
		
		
		
		
		
		
	// �޴� ����	
//		DoWhileMenu doWhileMenu = new DoWhileMenu();
//		FakeFlower fakeFlower = new FakeFlower();
//		
//		while(true) {
//			switch(doWhileMenu.displayMenu()) {
//			case 1 : fakeFlower.buyFlowerMenu(1);
//					// �� ��ü ����???
//			break;
////			case 2 : �ɸ�����(2);
////			break;
////			case 3 : �����ڸ޴�(3);
////			break;
//			default : 
//			//return; >> main �Լ� ����
//			System.exit(0); 
//			// ���α׷� ����(kill)
//			}
//
//
//	}

}
}



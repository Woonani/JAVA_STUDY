//import kr.or.kosa.DoWhileMenu;
//import kr.or.kosa.FakeFlower;
import kr.or.kosa.*;

public class FakeFlowerQuiz {

	public static void main(String[] args) {
		
		Flower flower1 = new Flower("Rose", 9550, "");
		MainMenu mainMenu = new MainMenu();
		FlowerMachine flowerMachine = new FlowerMachine();
		
		while(true) {
			switch(mainMenu.displayMenu()) {
			case 1 : flowerMachine.buyFlower();
			break;
			case 2 : flowerMachine.flowerInfo();
			break;
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

	}
}

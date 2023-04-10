import java.util.Scanner;

import kr.or.kosa.*;

public class FakeFlower_Quiz {

	public static void main(String[] args) {
		FakeFlower flower1 = new FakeFlower("장미", 10000);
		FakeFlower flower2 = new FakeFlower("카네이션", 20000);
		FakeFlower flower3 = new FakeFlower("무궁화", 30000);
		FakeFlower flower4 = new FakeFlower("국화", 40000);
		
		DoWhileMenu menu = new DoWhileMenu();
		FakeFlowerVendingMachine vm = new FakeFlowerVendingMachine();
		
		while(true) {
			int inputValue = menu.displayMenu(flower1, flower2, flower3, flower4);
			
			String productName ="";
			int productPrice =0;
			FakeFlower selectedFlower = new FakeFlower(null, 0);; 
			switch (inputValue) {
				case 1:{
					selectedFlower = flower1; break;
				}
				case 2:{
					selectedFlower = flower2; break;
				}
				case 3:{
					selectedFlower = flower3; break;
				}
				case 4:{
					selectedFlower = flower4;
				}				
			}
			if(vm.isConfirmed(selectedFlower)) {
				System.out.println(vm.buyProduct(selectedFlower));
				}
			
		}
		
		
		
		
	}

}

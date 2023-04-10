package kr.or.kosa;

import java.util.Scanner;

public class DoWhileMenu {	
		
	public int displayMenu(FakeFlower flower1, FakeFlower flower2, FakeFlower flower3, FakeFlower flower4) {
		Scanner sc = new Scanner(System.in);
		int inputValue = 0;	
		do {

		System.out.println("***조화판매기***");
		System.out.println("1. "+flower1.getFlowerName());
		System.out.println("2. "+flower2.getFlowerName());
		System.out.println("3. "+flower3.getFlowerName());
		System.out.println("4. "+flower4.getFlowerName());
		System.out.println("************");
		System.out.println("호갱님 환영합니다");
		System.out.println("구매를 원하시는 상품의 번호를 입력하세요");		
		inputValue = sc.nextInt();
		if (inputValue != 1 && inputValue != 2 && inputValue != 3 && inputValue != 4) {
			System.out.println("올바른 메뉴번호를 입력하세요");
			} else {sc.close();	break;}
		} while(true);
		
		return inputValue;
	}
	
	
	
	public void inputRecord() {
		
	}
	public void deleteRecord() {
		
	}
	public void sortRecord() {
		
	}

}

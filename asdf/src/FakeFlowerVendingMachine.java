package kr.or.kosa;

import java.util.Scanner;

public class FakeFlowerVendingMachine {
	private int serialNum;
	private String brandName;
	private int asPeriod;
	
	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getAsPeriod() {
		return asPeriod;
	}

	public void setAsPeriod(int asPeriod) {
		this.asPeriod = asPeriod;
	}

	public boolean isConfirmed(FakeFlower selectedFlower) {
		if(selectedFlower==null) {return false;}		
		System.out.printf("선택하신 상품은 [%s], 가격은 [%d]입니다.\n",selectedFlower.getFlowerName(), selectedFlower.getFlowerPrice());
		System.out.println("결제하시겠습니까?");
		System.out.println("1.Yes\t2.No");
		Scanner sc2 = new Scanner(System.in);
		int inputValue = sc2.nextInt();
		if(inputValue == 1) {return true;}
		else if(inputValue == 2 ){return false;}
		else {System.out.println("1(결제) 혹은 2(취소) 숫자를 눌러주세요");}
		return true;		
	}
	
	public int buyProduct(FakeFlower selectedFlower) {
		int change = 0;
		System.out.println("금액을 투입하세요");
		
		return change;
	}
	
	
		

	

	
	
	
	
	
	
	
}

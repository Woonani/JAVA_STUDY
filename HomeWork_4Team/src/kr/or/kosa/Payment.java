package kr.or.kosa;

import java.util.Scanner;

public class Payment {
	public void buyFlower(int selectedFlower) {
		
	}
	
	public static void payMoney(int price, int money) {
		int change = money - price;
		if(change > 0) {
				
			int unit = 10000;
			int num = 0;
			int sw = 0;
	
		
			do {
				num = (int) ( change/unit);
				if(num > 0) {					
					System.out.printf(" %d ��  %d �� , ", unit, num); 
//					System.out.println();
				}
				if(unit <= 1 ) {break;}
					change=change - unit*num;
					if(sw == 0) {
						unit=unit/2;
						sw=1;
					}else {
						unit = unit/5;
						sw=0;
					}
					
			}while(true); 
			
			
			System.out.println("�Ž������� ��ǰ�� �޾��ּ���!");
		}else if(change == 0){
			System.out.println("�����Ϸ�! ��ǰ�� ���ɴϴ�.");
		}else{
			System.out.println("�ݾ��� �����մϴ�. ó������ �ٽ� ������ �ּ���!");
		}
	}
	
}

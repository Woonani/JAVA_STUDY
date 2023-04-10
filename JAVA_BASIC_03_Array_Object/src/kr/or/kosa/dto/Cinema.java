package kr.or.kosa.dto;

import java.util.Scanner;

public class Cinema {
	Scanner sc = new Scanner(System.in);
	
	String[][] seat;

	String[][] reservedSeatInfo;
	
	static String reservationNum;
	// ���� Ŭ����
	Reservation reservation; // ***���� ����
	// ���� ��ȸ Ŭ����
	CheckReservation checkReservation;
	// ���� ��� Ŭ����
	CancelMovie cancelMovie;
	
	public Cinema(String[][] seat, String[][] reservedSeatInfo){
		this.seat = seat;
		reservation = new Reservation(seat, reservedSeatInfo); // ***������ �� seat �����ֱ�
		checkReservation = new CheckReservation(seat, reservedSeatInfo);
		cancelMovie = new CancelMovie(seat, reservedSeatInfo);
	}

	
	public void movieSystem() {
//		System.out.println(seat[2][3]);
		do {
			switch(cinemaMenu()) {
			case "1" :
				reservation.reservationMenu();
				break;
			case "2" :
				checkReservation.checkReservation();
				break;
			case "3" :
				int[] result = checkReservation.checkReservation();
				cancelMovie.cancelMovieTicket(result);
				break;
			default : 
				System.out.println("�߸������ϼ̽��ϴ�. �޴��� �ٽ� ����ּ���.");
			
			}
			
		}while(true);
	}
	
	
	
	
	// ���θ޴�
	public String cinemaMenu() {
		System.out.println("*************************");
		System.out.println("*******��ȭ ���� �ý���******");
		System.out.println("*************************");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ������ȸ");
		System.out.println("3. �������");
		String menuNum = sc.nextLine().replace(" ", "");
		return menuNum;
	}
}

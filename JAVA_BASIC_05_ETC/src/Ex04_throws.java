import java.io.IOException;

import kr.or.kosa.utils.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {
		// ���� �߻� ��
		//		ExClass ex = new ExClass("Temp");
		
		// ���1.
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// ���2.
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	
	}

}

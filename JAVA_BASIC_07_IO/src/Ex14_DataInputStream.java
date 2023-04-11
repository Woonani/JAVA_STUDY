import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputStream {

	public static void main(String[] args) {
		//���� score.txt �л� ���� ���
		// read �л� ���� �հ� / ���
		
		int sum = 0;
		int score = 0;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt(); //writeInt()  // �дٰ� ���ܰ� �߻��ϸ� catch�� ����
				System.out.println("score int ���� : " + score);
				sum += score;
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("sum�� ��� : " + sum);
		} finally {
			try {
				dis.close();
				fis.close();
			}catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}

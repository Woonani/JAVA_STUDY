import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.kosa.UserInfo;

/*
 ������ ������� �۾�
 ���Ͽ� ��ü write (����ȭ �������)
 
 */
public class Ex15_ObjectDataOutputStream {

	public static void main(String[] args) {
		String filename = "UserData.txt";
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null; // ����ȭ�� �����ϰ� �ϴ� ��ü
		
		try {
			fos = new FileOutputStream(filename);
			bos = new BufferedOutputStream(fos);
			// ����ȭ
			// ���� write ����ȭ ....
			out = new ObjectOutputStream(bos);
			
			// ��ü ���� : ���߿��� Map���� ��Ƽ� ��
			UserInfo u1 = new UserInfo("ȫ�浿", "hero", 100); //����ǰ
			UserInfo u2 = new UserInfo("hankock", "tiger", 50);
			
			//����ȭ
			out.writeObject(u1); // UserInfo ��ü�� ���� ������ write
			out.writeObject(u2);
			//END
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				out.close();
				bos.close();
				fos.close();
				System.out.println("���� ���� -> buffer -> ����ȭ -> ����write");
			} catch (Exception e2) {
				
			}
		}
		

	}

}

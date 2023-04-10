import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// ������ byte�� �Է¹޾� ���Ϸ� ���
/*
 Today Point
 
 Byte �����͸� read / write ����� >> File (a.txt)
 
 FileInputStream
 FileOutputStream
 �̹���, ���� read, write
 
 File >> 1.txt, 1.data (write, read)
 
 I/O�ڿ��� ������ ���������� �ڿ������� �����۾��� ����� �� (���� ���� �۾��߿� ���� ���� ������� ..��Ȳ �������� �ݱ�)
 >> Close()
 >> ����ó�� (������) ����ϴ� I/O �迭�� Ŭ������ ������ ����ó���� �䱸�ϴ� �ڵ尡 ����
 
 */
public class Ex02_FileStream {

	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;

		String path = "D:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("D:\\Temp\\new.txt", true);
			// ���� Temp ���� �ȿ� new.txt ������ �����
			/*
			 FileOutStream
			 1. write ������ �������� ������ >> �ڵ� ���� ���� (create ���)
			 
			 2. fos = new FileOutputStream("D:\\Temp\\new.txt", false);
			    false >> overwrite
			 
			 3. fos = new FileOutputStream("D:\\Temp\\new.txt", true);
			    true >> append (÷��) 
			    // 1�� ������ true �ɼ����� 3�� ����� new.txt���� HelloHelloHelloHello �̷��� �Ǿ��ִ�. 
			 
			 */
			int data = 0;
			while((data = fs.read()) != -1) {
//				System.out.println("���� : " + data + " : " + (char) data); //���� : 72 : H
				fos.write(data); // ��� ��Ʈ�� // D:\\Temp\\new.txt
			}
			
		} catch (Exception e) { //} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			// ����, ������
			// �Լ��� ������ return�� �ϴ���
			// finally block�� ����ȴ�.
			// �ڿ����� (I/O) ������ �÷��Ͱ� �������� �ʾƿ�
			// close() ����� >> �Ҹ��� ȣ��
			
			try { // ���� ������ ���� ���� ������ ����ó��~
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}


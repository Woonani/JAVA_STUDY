import java.io.*;

/*
 ���ڱ���� �����ʹٷ��(char[])
 String Ŭ���� >> ���������� char[]�� ������
 
 Reader, Writer (�߻�Ŭ����)
 
 ����)
 FileReader, FileWriter  
 
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("Ex01_Stream.java");//read
			fw = new FileWriter("copy_Ex01.txt"); // ��ο� ������ ������ create �Ѵ�
			
			int data = 0;
			while((data = fr.read()) != -1) {
//				System.out.println(data);
//				fw.write(data);
				if(data != '\n' && data != '\r' && data != '\t' && data != ' ') {
					fw.write(data);
					//���� , �� , ���ڴ� ���Ͽ� ���� �ʰڴ�
					//�������
					//https://jquery.com/download/ ������� �ٿ�ε� ... 
				}
			}
		} catch (Exception e) {
			e.printStackTrace(); // catch�� ��¹�
		} finally {
			try {
				
				fw.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

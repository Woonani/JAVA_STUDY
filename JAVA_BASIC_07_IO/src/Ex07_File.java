//import java.io.File;
import java.io.*;

/*
 ����, ������ �ٷ�� Ŭ���� �н�
 C# : ����(File), ����(Directory)
 
 JAVA : File (���ϻ���, ����..... ��������, ����) �ϳ��� Ŭ������
 >> a.txt ����, ����, ����, ���� read
 >> Temp ����, ����, ����, ���� read
 
 ���
 ������ : C:\\ , D:\\ >> D:\\Temp\\a.txt 
 ����� : ���� ������ �߽����� >> ../ >> /
 
 */
public class Ex07_File {

	public static void main(String[] args) {
		String path = "D:\\Temp\\file.txt";
		
		File f = new File(path); // File��ü�� ��θ� param���� �־� ����
		// File Ŭ������ ���ϰ� ���� �� �ٷ�� ��ü�̴�!
		
		// File Ŭ������ �پ��� ���� ���
		System.out.println("���� ���� ���� (����, ����) : " + f.exists()); // ���� ���� ���� (����, ����) : true //  false >> ������ true
		System.out.println("�� ������ : " + f.isDirectory()); // �� ������ : false
		System.out.println("�� �����̴� : " + f.isFile()); // �� �����̴� : true

		System.out.println("���ϸ� : " + f.getName()); // ���ϸ� : file.txt
		
		System.out.println("������ : " + f.getAbsolutePath()); // ������ : D:\Temp\file.txt
		
		System.out.println("����ũ�� : " + f.length() + "byte"); // ����ũ�� : 0byte
		System.out.println("�θ��� : " + f.getParent() ); // �θ��� : D:\Temp
		
		
		
		
	}

}

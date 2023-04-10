import java.util.Properties;

/*
 Map �������̽��� ������ Ŭ����
 Ư���� ���� : <String, String> : key�� value�� Ÿ���� String���� �����Ǿ�����
 
 ������
 1. App ��ü�� ���Ǵ� �ڿ�����
 2. ȯ�溯�� (������ �ǹ�)
 3. ���α׷��� ����
 4. �α���ID, ���    ex) yml����
 5. ���뺯�� 
 
 
 */
public class Ex14_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin", "kosa@ot.kr");
		prop.setProperty("version", "1.x.x.x");
		prop.setProperty("downpath", "C:\\Temp\\images");
		//������Ƽ ������ ��������. �ַ� ���ø����̼��� �ڿ��� ����
		// ������ ���� ���������� ���ٰ� ����
		System.out.println(prop.getProperty("admin")); //kosa@ot.kr
		System.out.println(prop.getProperty("version")); //1.x.x.x
		System.out.println(prop.getProperty("downpath")); //C:\Temp\images

	}

}

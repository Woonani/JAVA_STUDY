import java.io.IOException;

/*
 try{
 
 }catch(Exception e){
 
 }finally{
 	���������� ����Ǵ� ��
 }
 finally �����ߴٸ� 
 ���ܰ� �߻��ϴ�, ���ܰ� �߻����� �ʴ� ���������� ����Ǿ�� �ϴ� ������ ������ ������ �ȴ�.
 
 ���� CD ��ġ PC
 1. ��ġ���� >> C:\Temp ���� >> ����
 2. ������ ���� >> ���α׷� ��ġ
 3. ����ġ >> C:\Temp ������ ���ϳ��� ����
 4. ������ġ >> �������� >> C:\Temp ������ ���ϳ��� ����
 
 */
public class Ex03_finally {
	
	static void copyFiles() {
		System.out.println("copy Files");
	}
	
	static void startInstall() {
		System.out.println("Install ...");
	}
	
	static void fileDelete() {
		System.out.println("file Delete");
	}
	
	/*
	 ���ܰ� �߻��Ϸ��� ������ ���ܰ� �߻��ؾ� ��. ex) 0/0, index ����...
	 "ȫ�浿" �ԷµǴ� ����.. �����ڰ� �ʿ信 ���ؼ� � ��Ȳ�� �������� ��Ȳ�̶�� ���� ����
	 >> ����� ���� ���� ó�� <<
	 throw new IOException
	 
	 */

	public static void main(String[] args) {
		/*
		copyFiles();
		startInstall();
		fileDelete();
		 */		  
		
		try {
			copyFiles();
			startInstall();			
			throw new IOException("Install ���� ���� �߻� ......");
		}catch(Exception e) {
			System.out.println("���ܰ� �߻� : " + e.getMessage()); // ������ ���� �����޽��� ����
		}finally {		
			// �������� ��
			// ����, �������̾ ������ ����
			// ** �Լ��� ������ return�� ������ finally ���� ���� ���� **
			fileDelete();
		}
	}

}

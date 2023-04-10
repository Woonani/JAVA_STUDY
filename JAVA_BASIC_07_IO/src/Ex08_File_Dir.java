import java.io.File;

public class Ex08_File_Dir {

	public static void main(String[] args) { // args�� �� file�� ������ �� �Ķ���ͷ� ���;� �� �� �ִ�.
//		System.out.println(args[0]);
		if(args.length != 1) { // ����� ...
			System.out.println("���� : java ���ϸ�  [���丮��]");
			System.exit(0); // ��������
			
		}
		// �͹̳� Ŀ�����ο��� �Ʒ��� ���� ġ�� main�Լ� param���� args �ڸ��� C:\\Temp�� �ͼ� Ȱ�밡���ϴ�.
		// java Ex08_File_Dir D:\\Temp
		
		File f = new File(args[0]); // File("D:\\Temp")
		if(!f.exists() || !f.isDirectory()) {
			// �������� �ʰų� �Ǵ� ���丮�� �ƴ϶��
			System.out.println("��ȿ���� ���� ����Դϴ�.");
			System.exit(0);
			
		}
		
		// ���� �����ϴ� ����̰� ... �������
		// POINT
		// ������ File("C:\\Temp") �� ��η� ����/������ �迭�� ����
		File[] files = f.listFiles();
		// [file][txt][jpg][txt][txt]
		//System.out.println(files.length);
		for(int i = 0 ; i < files.length ; i++) {
			String name = files[i].getName(); //���ϸ� or ������
			System.out.println(files[i].isDirectory() ? "[DIR]" + name : name);
		}
				
	}
}

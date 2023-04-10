import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
	static int totalfiles = 0;
	static int totaldirs = 0;

	static void printFileList(File dir) {
		System.out.println("Full Path : " + dir.getAbsolutePath());
		
		List<Integer> subdir = new ArrayList<>();
		
		File[] files = dir.listFiles(); // ���� �ڿ� ����
		for(int i=0; i<files.length; i++) {
			String filename = files[i].getName(); // ������, ���ϸ�
			if(files[i].isDirectory()) {
				filename = "[ DIR ]" + filename;
				//POINT
				subdir.add(i); // ������ ��� index ���� >> ArrayList ���ؼ�
				//subdir[0] = 1
			}else {
				filename = filename + " / " + files[i].length() + "byte";
			}
			//System.out.println(filename);
		}
		// ���� ����
		// ���� ����
		int dirnum = subdir.size(); // ���� �־��� ������ ���� ���� ����
		int filenum = files.length - dirnum; // ���� �־��� ������ ���� ����
		
		// ���� ���� ( ���� ���� �ڿ�)
		totaldirs += dirnum;
		totalfiles += filenum;
		
		System.out.println("[Current DirNum] : " + dirnum);
		System.out.println("[Current FileNum] : " + filenum);
		System.out.println("---------------------------------");
		/*
		 POINT (���� ������ �ٽ� ���� ���� .... ")
		 [0] >a.txt
		 [1] > aaa ���� > a-1����, a-2����
		 [2] > bbb ���� > b-1����, b.txt, b-1.jpg
		 [3] > java.jpg
		 */
		for(int i=0; i<subdir.size(); i++) {
			int index = subdir.get(i);
			printFileList(files[index]); // ��� ȣ�� ....
			
		}
	}
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("���� : java [������ ���ϸ�] [��θ�]");
			System.out.println("���� : java Ex10_File_SubList D:\\Temp");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
			System.exit(0);
		}
		
		/////////////////////////////////////////////////////////////
		//�������� ��� �׸��� ���� �ֱ���....
	    printFileList(f);
	    System.out.println("���� �� ���ϼ� : " + totalfiles);
	    System.out.println("���� �� ������ : " + totaldirs);

	}

}

import java.util.ArrayList;

import kr.or.kosa.Emp;

/*
 ��ü �迭
 */
public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		// 1. ��� 1���� ���弼��
		
		Emp emp = new Emp (1000, "������", "�屺");
		System.out.println(emp.toString());
		
		//2. ��� 2���� ���弼�� (Array)
		Emp[] emplist = {new Emp(100, "�达", "����"), new Emp(200,"�ھ�", "IT")};
	    for(Emp e : emplist) {
	    	System.out.println(e.toString());
	    }
	    
	    //-----------------------------------------------------------------------
	    //3.ArrayList ����ؼ�
	    ArrayList elist = new ArrayList();
	    elist.add(new Emp(100,"�达","����"));
	    elist.add(new Emp(200,"�ھ�","IT"));
	    
	    //�߰��Ի�
	    elist.add(new Emp(300,"�̾�","IT"));
	    
	    for(int i =0; i<elist.size();i++) {
	    	System.out.println(elist.get(i).toString());
//	    	System.out.println(elist.get(i));// �̰͵� �˾Ƽ� �����
	    }

	    
	    /*
	     �׳� ArrayList���ٰ� ��ü ������ 
	     */
	    
	    //toString() ������� ���� 3���� ��� ������ ����ϼ���
	    //hint) getter�� ����ϼ���
	    //ArrayList�� ���������� Object[] ...����
	    for(int i = 0; i<elist.size(); i++) {
	    	Object obj = elist.get(i);
	    	System.out.println(obj); //������ �� toString()�� �θ�
	    	//obj.getEmpno() �θ�Ÿ���� ���������� �ڽ�Ÿ���� �ڿ��� �������� ���ؿ� (������ ����)
	    	// �ڽ� Ÿ������ casting
	    	Emp e = (Emp) obj;
	    	System.out.println(e.getEmpno()+"/ "+e.getEname()+"/ "+e.getJob());
	    
	    }
	    
	    
	    
	  //���� ������ (Object >> �ʿ� >> Downcasting >> �ڽ� ���� 
	  		//Object ���� ���� ... ��ſ�
	  		//Ÿ�� ���� (�� Ÿ���� ���� ����) >> �������� ������ �ϳ��� Ÿ������ >> Ÿ���� �ʿ�ÿ� ���
	  		//Generic (���ʸ�)
	  		ArrayList<Emp> list2 = new ArrayList<Emp>();
	  		list2.add(new Emp(1,"A","IT"));
	  		for(Emp e : list2) {
	  			System.out.println(e.getEmpno());
	  		}
	    
	    
	}

}

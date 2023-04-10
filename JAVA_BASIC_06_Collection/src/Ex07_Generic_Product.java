import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.CopyEmp;
import kr.or.kosa.Emp;

class Product {
	int price;
	int bonuspoint;

	Product(int price){
		this.price = price;
		this.bonuspoint= (int)(this.price/10.0);
	}
}


class KtTv extends Product{

	KtTv(){
		super(500); 
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "KtTv";
	}
}

class Audio extends Product{
	Audio(){
		super(100); 
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook(){
		super(150); 
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}
public class Ex07_Generic_Product {

	public static void main(String[] args) {
		// 1. Array ����ؼ� ��ü ����
		// KtTv, Audio, NoteBook�� ���� �� �ִ� Cart ���弼��
		Product[] cart = new Product[3];
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		// ���� : �迭�� ũ�Ⱑ ����
		
		//2. ArrayList�� ����ؼ� Cart�� ���弼��
		List<Product> pcart = new ArrayList<>(); // �����Ϸ��� �˾Ƽ� <>�� <Product> ä����
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new Audio());
		pcart.add(new NoteBook());
		// �������� �߰�, ����
		for(Product product : pcart) {
			System.out.println(product);
		}
		
		//Emp
		//3. ArrayList�� ����ؼ� ��� 3�� ���弼��
		List<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(123,"��","����"));
		emplist.add(new Emp(1,"��","����"));
		emplist.add(new Emp(13,"��","����"));
		
		//3.1 ����� ������ toString()������� ���� ���, �̸�, ������ ����ϼ���
		// ������ for��
		for(Emp emp : emplist) {
			System.out.println(emp.getEmpno()+" / "+emp.getEname()+" / "+emp.getJob());
		}
		
		
		//3.2 3.1 �� �����ѵ� �Ϲ� for���� ����ؼ� ���, �̸�, ������ ����ϼ���
		for(int i = 0; i<emplist.size(); i++) {
			System.out.println(emplist.get(i));
		}
		
		//-----------------------------------------------------------------------
		// ArrayList ����ؼ� ��� 3���� ���弼��(CopyEmp)
		// CopyEmp(100, "�达", 1000)
		// CopyEmp(200, "�ھ�", 2000)
		// CopyEmp(300, "�̾�", 3000)
		List<CopyEmp> copylist = new ArrayList<>();
		copylist.add(new CopyEmp(100, "�达", 1000));
		copylist.add(new CopyEmp(200, "�ھ�", 2000));
		copylist.add(new CopyEmp(300, "�̾�", 3000));
		
		// 4.1 200�� ����� �޿��� 6000���� �����ϼ��� (�Ϲ� for���� ���ؼ�) getter, setter
		for(int i =0 ; i<copylist.size();i++) {
			if(copylist.get(i).getEmpno() == 200) {
				copylist.get(i).setSal(6000);
				break;
			}
		}
		
		//4.2 300�� ����� �̸��� �ھ����� "�ñ��ؾ�" �����ؼ� �� ����� ����ϼ��� (������ for��)
		for(CopyEmp emp: copylist ) {
			if(emp.getEname().equals("�ھ�")) {
				emp.setEname("�ñ��ؾ�");
			}
		}
	}

}

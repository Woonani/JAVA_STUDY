/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A�� ������ǰ ������ ���µǸ�

[Ŭ���̾�Ʈ �䱸����]
������ǰ�� ��ǰ�� ���� , ��ǰ�� ����Ʈ ������ ��� ��ǰ�� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸������� ������ �ִ�
ex)
������ ������ǰ�� �̸��� ������ �ִ� (ex) Tv , Audio , Computer
������ ������ǰ�� �ٸ� ���������� ������ �ִ�( Tv:5000 , Audio : 6000)
��ǰ�� ����Ʈ�� ������ 10%�����Ѵ�

�ùķ��̼� �ó�����
������: ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ�
ex) 10���� , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰ� �Ǹ� ������ �ִ� ���� �����ϰ� (����) ����Ʈ�� �����Ѵ�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�
*/

class Product {
	int price;
	int bonuspoint;
//	public Product() {
//		// TODO Auto-generated constructor stub
//	}
	Product(int price){
		this.price = price;
		this.bonuspoint= (int)(this.price/10.0);
	}
}


class KtTv extends Product{
//	class KtTv extends Product{ // �θ� ������ �����ε��� �ؼ� ���� > �θ� ����Ʈ ������ ����� ������� ������..�μ��� �־�� �Ѵ�.. �ٸ����
	KtTv(){
		super(500); // �׷��� ��� super�� ���ָ� ���� �����
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

//������
class Buyer{
	int money = 5000;
	int bonuspoint;
	
	// ��� ���ű��
	// ��ǰ�� ���� �� �� �ִ� ��� (3�� ���ű��)
	// �� �ܾ� - ��ǰ���� , ����Ʈ ���� +)
	
	// ������ �̿� 
	void productBuy(Product n) {
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�.^^ �ܾ� :" + this.money);
			return; // �Լ��� ����(����)
		}
		// �� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("�����ܾ��� : "+ this.money +" �Դϴ�.");
		System.out.println("����� �����Ͻ� ������ "+n.toString()+" �Դϴ�.");
	}
	
	// �Ʒ� �Լ���(ktTvBuy,audio,noteBook)�� ���� Buy�� �ٲ㵵 �Ǳ� �� > but, �ڵ差�� ���ҽ�Ű���� ����
	/*
	void ktTvBuy(KtTv n) { // �Լ��� parameter�� ��ǰ ��ü�� �޾Ƽ� (����, ����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�.^^ �ܾ� :" + this.money);
			return; // �Լ��� ����(����)
		}
		// �� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("�����ܾ��� : "+ this.money +"�Դϴ�.");
		System.out.println("����� �����Ͻ� ������"+n.toString()+"�Դϴ�.");
	}
	void audio(Audio n) { // �Լ��� parameter�� ��ǰ ��ü�� �޾Ƽ� (����, ����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�.^^ �ܾ� : " + this.money);
			return; // �Լ��� ����(����)
		}
		// �� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("�����ܾ��� : "+ this.money +"�Դϴ�.");
		System.out.println("����� �����Ͻ� ������"+n.toString()+"�Դϴ�.");
	}
	void noteBook(NoteBook n) { // �Լ��� parameter�� ��ǰ ��ü�� �޾Ƽ� (����, ����Ʈ)
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�.^^ �ܾ� :" + this.money);
			return; // �Լ��� ����(����)
		}
		// �� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		
		System.out.println("�����ܾ��� : "+ this.money +"�Դϴ�.");
		System.out.println("����� �����Ͻ� ������"+n.toString()+"�Դϴ�.");
	}
	 */
	
}

/*
 1�� ���� ...
 ���� >> �Ͽ��� �ް� ....
 
  ���忡 ��ǰ �� ���� 1000�� ��ǰ �߰� (���콺, �佺Ʈ��, û�ұ�) .. POS (�ڵ���� : ��ǰ)
  ���忡 1000���� ��ǰ ���� ....
  ��ü ������ �ָ� ���¼��� ....
  1. ���� 3�� ���� >> 997 ��ǰ ���Ű� �ȵǿ�.
  >> ���� >> �Ͽ��� >> PC�� >> ���� ����� >> ���� ���� ���� >> ��Ʋ ��� >> �����Լ� 997�� �߰�
  
 
 */

public class Ex12_Inheritance_KeyPoint {

	public static void main(String[] args) {

		// ������ �����ϰ� ����..�ùķ��̼�
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		Product p = kt; // �ڽ��� > �θ𿡰� �Ҵ��� O 
//		Audio d = p; : Ex11���� �� �������ٿ� �Ѱ�. �θ� > �ڽĿ��� �Ҵ��� X 
//		Audio d = (Audio) p;// : �����δ� ���� : DownCasting 
		Buyer buyer = new Buyer();
		buyer.productBuy(p);
		buyer.productBuy(kt);
		buyer.productBuy(kt);
		buyer.productBuy(audio);
		buyer.productBuy(audio);
		buyer.productBuy(notebook);
		buyer.productBuy(notebook);

		/*
//		buyer.ktTvBuy(kt);
//		buyer.ktTvBuy(kt);
//		buyer.ktTvBuy(kt);
//		buyer.ktTvBuy(kt);
//		buyer.ktTvBuy(kt);
//		buyer.ktTvBuy(kt);
//		buyer.ktTvBuy(kt);
//		buyer.audio(audio);
//		buyer.audio(audio);
//		buyer.noteBook(notebook);
//		buyer.noteBook(notebook);
//		buyer.noteBook(notebook);
//		buyer.noteBook(notebook);
//		buyer.noteBook(notebook);
		 */
		 
	}

}

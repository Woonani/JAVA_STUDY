/*
���� Ǯ�� ������ ^^
�䱸����
 >> ����īƮ �����ϱ� �Դϴ� <<
īƮ (Cart) >> member field
īƮ ���忡 �ִ� [��� ������ǰ]�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... [īƮ�� ��´�] // !!!!! buy �Ҷ� īƮ�� ��´�
---------------------------------------
���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���

hint) īƮ ������ ��� ���� (Buy() �Լ��ȿ��� cart  ��� ���� ���� )
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�  ����մϴ�

Buyer >> buy(), summary() >> īƮ�� ���ǰ�� (����ų�, �� ���� >> ����� �� �� ����) //!!!!! �żҵ� �߰�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�

*/
// īƮ�� 1���� �迭, ���δ�Ʈ�� ��´�. 
class Product2{  //extends Object
	int price;
	int bonuspoint;
	//Product() {	}
	Product2(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}

class KtTv2 extends Product2{
	KtTv2(){
		super(500);
	}
	
	//Object ������ 
	@Override
	public String toString() {
		return "KtTv2";
	}
}

class Audio2 extends Product2{
	Audio2(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio2";
	}
}

class NoteBook2 extends Product2{
	NoteBook2(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook2";
	}
}

//������
class Buyer2{
	Product2[] cart; // ������ ... īƮ ��� ��ǰ�� ��´�(�θ�Ÿ��) ; �� ��� ��ǰ�� Product2�� ����ؾ��Ѵٴ� ���� ��������
	int count; // �ʱ�ȭ�� �������Լ� �ȿ���
	int money;
	int bonuspoint;
//	int buyMoney = 0; // ���űݾ� >> summary������ �ʿ��ϹǷ� ����
//	String buyList=""; // ���� ����Ʈ >> summary������ �ʿ��ϹǷ� ����

	Buyer2(){
		this(5000); //this(1000,0);// ���ʽ� ����Ʈ�� ������
	}
	
	Buyer2(int money){//Buyer2(int money , int bonuspoint){ // ���ʽ� ����Ʈ�� ������
		cart= new Product2[10];
		this.count = 0;
		this.money = money;
		this.bonuspoint = 0;// this.bonuspoint = bonuspoint; // ���ʽ� ����Ʈ�� ������
	}
	
	void Buy(Product2 n) { 

		if(this.money < n.price ) {
			System.out.println("���� �ܾ��� �����մϴ�^^ " + this.money);
			return; //�Լ��� ����(����)
		}

		//������� �ڵ�//////////////////////////////////////////////
		if(count>9) { // count ��
			System.out.println("���� ��ٱ��ϸ� �ʰ��ϼ̽��ϴ�.");
			return;
		}
//		cart[count]=n;
//		count++;
		cart[count++]=n; // ��ġ������ �ڵ� ������ ���ٷ�!
		System.out.printf(" %d �� ���� / ", count);
		////////////////////////////////////////////////////////
		
		//�� ��������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.printf("������ ������ : %s  / " , n.toString());
		System.out.printf("���� �ܾ��� : %d  \n" , this.money );
//		this.buyMoney += n.price;
//		this.buyList += (n.toString() + ", ");
	}
	// void summary() �߰�
	/*
	����(��ٱ���)
	������ ���
	1. ������ ������ �Ѿ�
	2. ����Ʈ �Ѿ�
	3. ������ ���� ����Ʈ 
	�� ������ ���
	*/
	void summary() { // summary ���� ��� �غ���
		int buyMoney=0;
		String buyList="";
		int totalbonuspoint=0;// ������ ����Ʈ�� ���� ����Ʈ�� ������ ��� �������� ���� �ʿ��ϹǷ� ����ٰ� �ʱ�ȭ �ؾ��Ѵ�.
		if(count == 0 ) {
			System.out.println("���� ��ٱ��Ͽ� ����ִ� ������ �����ϴ�.");
		}else {
			
			/*
			for(int i = 0 ; i < cart.length ;i++) {  //������ ������ null ���� ����
				//�����̵� 10�� ������ ...
				if(cart[i] == null) break; //���� continue
				totalprice += cart[i].price;
				totalbonuspoint += cart[i].bonuspoint;
				productlist+= cart[i].toString()+ " ";
			}
			*/
			
			for(int i=0; i<count; i++) {
				buyMoney += cart[i].price;
				buyList += ( cart[i].toString() + " " );
				totalbonuspoint += cart[i].bonuspoint;
			}
			System.out.println("������ ������ : " + buyList);
			System.out.println("���� ������ ������ �Ѿ��� : " + buyMoney );
			System.out.println("������ ����Ʈ�� : " + totalbonuspoint );
			System.out.println("���� ����Ʈ�� : " + this.bonuspoint );
			System.out.println("���� �ܾ��� : " + this.money );
		}
		
	}
}


public class Ex13_Inheritance_KeyPoint {
//	Product2[] cart= new Product2[10];
	
	public static void main(String[] args) {
//		Product2[] cart= new Product2[10];
		
		KtTv2 ktTv = new KtTv2();
		Audio2 audio = new Audio2();
		NoteBook2 noteBook = new NoteBook2();

		Buyer2 buyer = new Buyer2();
		buyer.Buy(ktTv);
		buyer.Buy(audio);
		buyer.Buy(noteBook);
		buyer.Buy(ktTv);
		buyer.Buy(ktTv);
		buyer.Buy(ktTv);
		buyer.Buy(ktTv);
		buyer.Buy(ktTv);
		buyer.Buy(ktTv);
		buyer.Buy(ktTv);
		buyer.Buy(ktTv); 
		buyer.summary();
		
		
	}

}

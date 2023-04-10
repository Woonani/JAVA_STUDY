class Product3{  //extends Object
	int price;
	int bonuspoint;
	//Product() {	}
	Product3(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}

class KtTv3 extends Product3{
	KtTv3(){
		super(500);
	}
	
	//Object ������ 
	@Override
	public String toString() {
		return "KtTv3";
	}
}

class Audio3 extends Product3{
	Audio3(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio3";
	}
}

class NoteBook3 extends Product3{
	NoteBook3(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook3";
	}
}

//������
class Buyer3{
	int money;
	int bonuspoint;
	Product3[] cart;
	int top; // ������ �� ��ġ
	
	public Buyer3() {
		this(10000);
	}
	
	public Buyer3(int money){ 
		this.money = money;
		this.cart = new Product3[10]; 
		this.top = 0;
	}
	
	void Buy(Product3 n) { 
		cart[top++] = n;
	}
	
	/*
	 * ����(��ٱ���)
	 * ������ ���
	 * 1. ������ ������ �Ѿ�
	 * 2. ����Ʈ �Ѿ�
	 * 3. ������ ���� ����Ʈ
	 * �� ������ ���
	 */
	void summery() {
		int priceSum = 0;
		int bonusSum = 0;
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i=0; i<top; i++) {
			priceSum += cart[i].price;
			bonusSum += cart[i].bonuspoint;
			stringBuilder.append(cart[i].toString()+" ");
		}
		System.out.println("���� ���� : " + stringBuilder.toString());
		System.out.println("���� : " + priceSum);
		System.out.println("���ʽ� : " + bonusSum);
	}
}

public class Ex13_Inheritance_KeyPoint2 {
	
	public static void main(String[] args) {
		Buyer3 buyer = new Buyer3();
		buyer.Buy(new NoteBook3());
		buyer.Buy(new Audio3());
		buyer.Buy(new KtTv3());
		buyer.summery();
	}

}
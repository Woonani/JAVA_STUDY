/*
 ���� ����
 �� ���� Ŭ������ ���� ��� (x)
 
 ���赵 1�� ��� ������ ���� .. ���������� �Ұ���
 ���赵�� �������� ������...���� �߻� (����, ��)
 
 ���θ�
 ��������, ��۰���, ������, ȸ������, ��ǰ����, �Ǹ�ó����, ī�� ���� ... >> ������ �������� ���赵
 
 *********����*************
 �������� ���赵�� ���� �� ���� ... ������ִ� ����
 
 1. ��� : is ~ a  : �� (��) ~ �̴� >> ����� ����� ���� (�θ� �ڿ�)
 2. ���� : has ~ a : �� (��) ~ ������ �ִ� >>  

���� �����̴�.
������ �����̴�. (x)
������ ������ ������ �ִ�.

���� �����̴�
�� extends ����
�ﰢ���� �����̴�
�ﰢ�� extends ����

��, �� ����
���� ���̴� (x)

���� ���� ������ �ִ�.(o)
has ~ a (��ǰ����)
>> class �� { ���̶�� ��ǰ�� member field ����   �� ������}
>> class �� { x, y }

���� ����
������ �����̴� (x)
������ ������ ������ �ִ� (o)
>> class ���� {}
>> class ���� { ���� member field }

���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

���� �и� (������) �ڿ� : �߻�ȭ, �Ϲ�ȭ >> �׸���, ����
���� : ��üȭ, Ư��ȭ(�ڽŸ��� ������ Ư¡) >> ������, ����

��: ��ǥ��(x,y)
���� ���� ������ �ִ�
�ﰢ���� ���� ������ �ִ�
�簢���� ���� ������ �ִ�.

----------------------------------------
class Shape{ �׸���, ���� } >> ��Ӱ��� �θ� >> ��, �ﰢ��, �簢��
class Point { ��ǥ�� } >> ���԰��� >> (��ǰ)

��üȭ, Ư��ȭ : Circle, Triangle 

 */

class Shape {
	String color = "gold";
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Point {
	int x;
	int y;
	
	Point(){
//		this.x = 1;
//		this.y = 1;
		this(1,1);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

// ����)
/*
 ���� ���弼�� (���� ���� : ���� ������ �������� ������ �ִ�)
 1. ���� �����̴� (is ~ a) : Shape
 2. ���� ���� ������ �ִ�. (has ~ a) : Point
 3. ���� Ư��ȭ�ǰ� ��üȭ�� ������ : ������
 
 ���� �������� �ʱⰪ 10�� ������. 
 ���� ��ǥ�� �ʱⰪ (10, 15)�� ������.
 �ʱⰪ�� �������� ������ �������� ���� ���� �Է¹��� �� �ִ�.
 */


class Circle extends Shape { //1. ���� �����̴�
	Point point; // ���� > ��ǰ 2. ���� ���� ������ �ִ�. 
	//int x; 	int y;	// Ʋ��!!!
	int r; // ��üȭ, Ư����
	
	Circle(){
//		r=10;
//		Point point = new Point(10, 15);
		this(10, new Point(10,15)); //?????????????
//		this.Circle(10, new Point(10,15)); //!!!!�̰žƴ�!!!!!
	}
	
	Circle( int r, Point point){//point�� Point ��ü�� �ּҰ��� �޴´�
		this.r = r;
		this.point = point;
				
	}
//	Circle(int x, int y, int r){
//		this.point = new Point(x, y);
//		this.r = r;
//	}
}

//����2)
/*
�ﰢ�� Ŭ������ ���弼��
�ﰢ���� 3���� ���� ����� �׸��� �׸��� ����� ������ �ִ�.
hint) Shape, Point ���� �޾Ƽ� ���赵 �ۼ��ϼ���
hint) (x,y),(x,y),(x,y)
default �ﰢ���� ���� �� �ְ� 3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ�.
*/
// ����
class Triangle extends Shape {
	Point[] points;

	Triangle(){
		this.points = new Point[]{new Point(),new Point(), new Point()};
	}
	Triangle(Point point1, Point point2, Point point3){
		this.points = new Point[]{point1,point2, point3};
		
	}
}

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		// ��-------------------------------------------------------
		Circle circle = new Circle();
		System.out.println(circle.r);
		System.out.println(circle.color);
		System.out.println(circle.point.x);//�ּҰ�.�ּҰ�.�ּҰ�.field
		System.out.println(circle.point.y); 
		circle.draw();
		
		// ������, ���� ���� �����ӰԻ����ϴ� ��� �� ����---------------
		// ���ٷ� : point�� �ٸ� ���� ���� ���� �̰� ���� 
		Point point = new Point(1,2); 
		Circle circle3 = new Circle(100, point);
		// ���ٷ� : �ѹ��� �ʿ��� ���� �̰� ���� (�̷����� �ڵ尡 ����� ��)
		Circle circle2 = new Circle(100, new Point(1,2)); 
		
		
		// �ﰢ��-------------------------------------------------------
		Triangle triangle = new Triangle(new Point(1,2),new Point(1,2),new Point(1,2));
		System.out.println(triangle.color);
		System.out.println(triangle.points[0].x);
		triangle.draw();
		
		//������ �ﰢ��
//		Triangle1 tri = new Triangle1();
//		tri.trianglePoint();
//		
//		Triangle tri2 = new Triangle1(new Point(1,2), new Point(3,4),new Point(5,6));
//		tri2.trianglePoint();
//		
//		
//		Point[] parray = new Point[] {new Point(11,22),new Point(33,44),new Point(55,66)};
//		Triangle2 tri3 = new Triangle2(parray);
//		tri3.trianglePoint();
	}

}
/*
�� ���� ���� �Ʒ� ���� Ǯ�� ������ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
�ﰢ�� Ŭ������ ���弼��
�ﰢ���� 3���� ���� ����� �׸��� �׸��� ����� ������ �ִ�
hint) Shape , Point ���� �޾Ƽ� ���赵 �ۼ� �ϼ���
hint) (x,y) , (x,y) , (x,y)
default �ﰢ���� ���� �� �ְ�  3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ� 

���κ��� Ǯ�� ���ð� ���� �� ���� ���鼭 ä���� �� �帱�Կ� ^^
50 , 70 , 100�� ���� ������ �帱�Կ� ^^
*/
// ������ �ﰢ�� Ŭ����
class Triangle1 extends Shape {
	Point x;
	Point y;
	Point z;
	
	public Triangle1() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		this(new Point(10,20),new Point(30,40),new Point(50,60));
	}
	
	public Triangle1(Point x , Point y , Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	//��üȭ ,Ư��ȭ
	//�߰����� ���
	void trianglePoint() {
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
	}
	
}


//100��
class Triangle2 extends Shape {
	Point[] pointarray;
	
	
	public Triangle2() {
		this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
	}
	
	public Triangle2(Point[] pointarray) {
		this.pointarray = pointarray;
	}
	
	
	//��üȭ ,Ư��ȭ
	//�߰����� ���
	void trianglePoint() {
		for(Point point : this.pointarray) {
			System.out.printf("(%d,%d)\t",point.x , point.y);
		}
		/*
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
		System.out.println();
		*/
	}
	
}

package Pack;

import org.springframework.context.support.GenericXmlApplicationContext;


class A{	void f1() {}	}
class B extends A{	void f2() {}	}
class C{
	A m1() { return new A(); }
	Object m2() { return new B(); }	// ��ĳ����
//	B m3() { return new A(); }	// �ڽ��� ���� = �θ� ��(�ڹ� �������� ������ �ȵ�)
	B m4() { return new B(); }
}

public class Hello {
	public static void main(String[] args) {
		// ������ ���� = �������� �޸� Ȯ��
		C c = new C();
		
		// a0, a1, a2�� ����
//		A a0 = c.m2();
		A a1 = (A)c.m2();	// AŸ������ ĳ����
		A a2 = (B)c.m2();	// BŸ������ ĳ����
		a1.f1();
		a2.f1();
		
		((A)c.m2()).f1();
//		((A)c.m2()).f2();
		((B)c.m2()).f1();
		((B)c.m2()).f2();
				
	}
}


/*
interface Fuel{
	String getFuel();
}

class Water implements Fuel{
	public String getFuel() {
		return "��";
	}
}

class Gas implements Fuel{
	public String getFuel() {
		return "����";
	}
}

class Airplane{
	Fuel fuel;
	Airplane(Fuel fuel) {
		this.fuel = fuel;
	}
	void fly() {
		System.out.println(fuel.getFuel() + " �� ����");
	}
}

class Ship{
	Fuel fuel;
	Ship(Fuel fuel) {
		this.fuel = fuel;
	}
	void fly() {
		System.out.println(fuel.getFuel() + " �� ����");
	}
}

class Car{
	Fuel fuel;
	Car(Fuel fuel) {
		this.fuel = fuel;
	}
	void fly() {
		System.out.println(fuel.getFuel() + " �� �޸���");
	}
}

public class Hello {

	public static void main(String[] args) {
		System.out.println(1);

		// �ܺο� �ִ� xml���� �������� ���
		// �ؿ� GenericXmlApplicationContext ���ְ�
		// xml���� �̸� ����
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("Context.xml");
		
		Airplane airplane = ctx.getBean("airplane", Airplane.class);
		airplane.fly();
		
		Ship ship = ctx.getBean("ship", Ship.class);
		ship.fly();
		
		Car car = ctx.getBean("car", Car.class);
		car.fly();
		
		ctx.close();
		
				
	}

}

*/
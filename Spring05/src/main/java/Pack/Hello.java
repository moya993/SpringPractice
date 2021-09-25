package Pack;

import org.springframework.context.support.GenericXmlApplicationContext;


class A{	void f1() {}	}
class B extends A{	void f2() {}	}
class C{
	A m1() { return new A(); }
	Object m2() { return new B(); }	// 업캐스팅
//	B m3() { return new A(); }	// 자식이 받음 = 부모가 줌(자바 문법에서 성립이 안됨)
	B m4() { return new B(); }
}

public class Hello {
	public static void main(String[] args) {
		// 왼쪽은 문법 = 오른쪽은 메모리 확보
		C c = new C();
		
		// a0, a1, a2는 동일
//		A a0 = c.m2();
		A a1 = (A)c.m2();	// A타입으로 캐스팅
		A a2 = (B)c.m2();	// B타입으로 캐스팅
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
		return "물";
	}
}

class Gas implements Fuel{
	public String getFuel() {
		return "가스";
	}
}

class Airplane{
	Fuel fuel;
	Airplane(Fuel fuel) {
		this.fuel = fuel;
	}
	void fly() {
		System.out.println(fuel.getFuel() + " 로 날다");
	}
}

class Ship{
	Fuel fuel;
	Ship(Fuel fuel) {
		this.fuel = fuel;
	}
	void fly() {
		System.out.println(fuel.getFuel() + " 로 간다");
	}
}

class Car{
	Fuel fuel;
	Car(Fuel fuel) {
		this.fuel = fuel;
	}
	void fly() {
		System.out.println(fuel.getFuel() + " 로 달린다");
	}
}

public class Hello {

	public static void main(String[] args) {
		System.out.println(1);

		// 외부에 있는 xml파일 가져오는 방법
		// 밑에 GenericXmlApplicationContext 써주고
		// xml파일 이름 적기
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
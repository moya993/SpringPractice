package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

class Animal{
	Animal(){
		System.out.println("생성자 콜1");
	}
	void m1() {
		System.out.println("콜1");
	}
}


class Tiger extends Animal{
	Tiger(){
		System.out.println("생성자 콜2");
	}
	
	void m2() {
		System.out.println("콜2");
	}
}

// 방법1.
public class Hello {

	public static void main(String[] args) {
		// Animal t = new Animal();
		// t.m1();
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(
					"classpath:Context.xml"
				);
		System.out.println("ctx 얻음");	// ctx얻었는지 확인하는 코드
		Animal t1 = ctx.getBean("tiger", Animal.class);	// tiger타입으로 받음 : 업캐스팅		
		t1.m1();
		
		Animal t2 = ctx.getBean("tiger", Tiger.class);	// tiger타입으로 받음 : 업캐스팅
		t2.m1();
		
		ctx.close();
	}

}




/* 방법2. 잘 안씀
@Configuration		// Spring 환경 설정을 알림
class Apple{
	Apple(){
		System.out.println(1);
	}
	void f1() {
		System.out.println(2);
	}
}

class Appconfig{
	@Bean	// 밑에있는 객체를 생성해달라는 말
	public Apple apple() {
		return new Apple();
	}
	
}

public class Hello{
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(Appconfig.class);
		Apple a2 = ctx.getBean("apple", Apple.class);
		a2.f1();
		
		
  		
		
	}
}
*/


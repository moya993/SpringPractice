package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

class Animal{
	Animal(){
		System.out.println("������ ��1");
	}
	void m1() {
		System.out.println("��1");
	}
}


class Tiger extends Animal{
	Tiger(){
		System.out.println("������ ��2");
	}
	
	void m2() {
		System.out.println("��2");
	}
}

// ���1.
public class Hello {

	public static void main(String[] args) {
		// Animal t = new Animal();
		// t.m1();
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(
					"classpath:Context.xml"
				);
		System.out.println("ctx ����");	// ctx������� Ȯ���ϴ� �ڵ�
		Animal t1 = ctx.getBean("tiger", Animal.class);	// tigerŸ������ ���� : ��ĳ����		
		t1.m1();
		
		Animal t2 = ctx.getBean("tiger", Tiger.class);	// tigerŸ������ ���� : ��ĳ����
		t2.m1();
		
		ctx.close();
	}

}




/* ���2. �� �Ⱦ�
@Configuration		// Spring ȯ�� ������ �˸�
class Apple{
	Apple(){
		System.out.println(1);
	}
	void f1() {
		System.out.println(2);
	}
}

class Appconfig{
	@Bean	// �ؿ��ִ� ��ü�� �����ش޶�� ��
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


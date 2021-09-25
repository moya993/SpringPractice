package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// @Controller �־��ָ� ���� �ؿ� Tiger Ŭ������ ��Ʈ�ѷ��� �νĵ�
@Controller

public class Tiger {
	// ������ ¦���� �ִ� �� �����̶���("/t1"�� method�� ����(����)����)
	// ���� �Լ� �ڿ� ��� �ҷ����� ���� �־���
	// �ܺο��� t1�� �θ��� ���� �ؿ� method01�Լ��� ȣ���
	@RequestMapping("/t1")
	public String method01() {
		// �ȿ� DAO�� ���;� ��
		
		System.out.println("�Լ� ��1");
		return null;	// �Լ� ������� �� ������ ���Ϸ��� �ϴ� null������ ������ �ּ�
	}
	
	// ���ο� ����2
	@RequestMapping("/t2")
	public String method02() {
		// �ȿ� DAO�� ���;� ��
		
		System.out.println("�Լ� ��2"); 
		// ��Ʈ�ѷ� �̸�(Tiger)�� ���缭 �̸��� �����ִ°��� ���� 
		return "TigerView";	// ���� �� jsp���ϸ��� �����ּ�, TigerView.jsp ���Ϸ� ������
	
	
	}
	
	
}


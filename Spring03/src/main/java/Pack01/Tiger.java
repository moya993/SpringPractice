package Pack01;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller �־��ָ� ���� �ؿ� Tiger Ŭ������ ��Ʈ�ѷ��� �νĵ�
@Controller
public class Tiger {
	@RequestMapping("/t1")
	// ������ ¦���� �ִ� �� �����̶���("/t1"�� method�� ����(����)����)
	// ���� �Լ� �ڿ� ��� �ҷ����� ���� �־���
	// �ܺο��� t1�� �θ��� ���� �ؿ� method01�Լ��� ȣ���
	public String method01() {
		// �ȿ� DAO�� ���;� ��

		System.out.println("�Լ� ��1");
		return null; // �Լ� ������� �� ������ ���Ϸ��� �ϴ� null������ ������ �ּ�
	}

	// ���ο� ����3
	@ResponseBody // Body��� ����ټ� �ɾ��ָ�
	@RequestMapping("/t2")
	public String method03() {
		// �ȿ� DAO�� ���;� ��

		System.out.println("�Լ���3");
		// ��Ʈ�ѷ� �̸�(Tiger)�� ���缭 �̸��� �����ִ°��� ����
		return "Tiger Call"; // ���� �� jsp���ϸ��� �����ּ�, TigerView.jsp ���Ϸ� ������
	}

	// ���ο� ����2
	@RequestMapping("/t3")
	public String method02() {
		// �ȿ� DAO�� ���;� ��

		System.out.println("�Լ���2");
		// ��Ʈ�ѷ� �̸�(Tiger)�� ���缭 �̸��� �����ִ°��� ����
		return "TigerView"; // ���� �� jsp���ϸ��� �����ּ�, TigerView.jsp ���Ϸ� ������

	}

	// ���ο� ����4
	@ResponseBody // Body��� ����ټ� �ɾ��ָ�
	@RequestMapping("/t4")
	public String method04(
			// �ؿ� RequestParam�� index���� ���� name(�ڳ���)�� Controller(Tiger.java)�� �Ѿ������ Ȯ���ϱ� ����
			@RequestParam(value = "name") String name // value=name�� index�� name(�ڳ���)�� �� String�� name�� �ʱ�ȭ
	) {
		System.out.println("�Լ���4 " + name);
		// ��Ʈ�ѷ� �̸�(Tiger)�� ���缭 �̸��� �����ִ°��� ����
		return "TigerView"; // ���� �� jsp���ϸ��� �����ּ�, TigerView.jsp ���Ϸ� ������
	}

	// ���ο� ����5
	@RequestMapping("/t5")
	public String method05(
			// �ؿ� RequestParam�� index���� ���� name(�ڳ���)�� Controller(Tiger.java)�� �Ѿ������ Ȯ���ϱ� ����
			@RequestParam(value = "name") String name, // value=name�� index�� name(�ڳ���)�� �� String�� name�� �ʱ�ȭ
			@RequestParam(value = "age") int age) 
	{
		System.out.println("�Լ���5 " + name + " " + age);
		return "TigerView";
	}

	// ���ο� ����6
	@RequestMapping("/t6")
	public String method06(
			// ServletRequest�� ������ ��ü�� �ѹ��� �� ���� �� ����
			HttpServletRequest request) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("�Լ���6" + name + age);
		return "TigerView"; // ���� �� jsp���ϸ��� �����ּ�, TigerView.jsp ���Ϸ� ������
	}

	// ���ο� ����7
	// Controller���� TigerView�� �����͸� �����ϰڴ�.
	@RequestMapping("/t7")
	public String method07(Model model) {	// �� ��ü ����
		model.addAttribute("name", "�޹���");
		model.addAttribute("age", "50");
		System.out.println("�Լ���7");
		return "TigerView";		// return TigerView�� ���� �� �� model���� ���� TigerView�� �Ѿ
	}
	
	

}










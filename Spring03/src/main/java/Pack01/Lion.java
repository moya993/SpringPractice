package Pack01;

import java.util.LinkedList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller


public class Lion {
	// ���ο� ����8
		@RequestMapping("/t8")
		public String method01(
				Model model,
				HttpServletRequest r
				) {
			// ���������� ���� ģ����
			String name = r.getParameter("name");
			String age = r.getParameter("age");	
			System.out.println("�Լ���8"+name+age);
			
			model.addAttribute("name", name);
			model.addAttribute("age", age);
			return "LionView";
		}
		
		
		// ���ο� ����9
		// ��Ʈ�ѷ����� View�� ���� ������ �ٸ� ���2
		// �Լ� �ȿ��� ��ü�� �����ؼ� ���� ������
		@RequestMapping("/t9")
		public ModelAndView method02() {
			System.out.println("test");
			ModelAndView mv = new ModelAndView("LionView");		// LionView�� ������
			
			
			
			mv.addObject("name", "�䲿��������");
			mv.addObject("age", 3000);
			return mv;	// ������ mv�� ����
		}
		
		
		// ���ο� ����10
		// ����9�� ���������� ���׿����� ��ũ������ �Ѵٸ� ����10���� �ϼ�
		// ���׿����ڷ� �ؿ� ���ǽ��� �¾Ƽ� TigerView�� ���� ������
		@RequestMapping("/t10")
		public ModelAndView method03() {
			System.out.println("test");
			ModelAndView mv = new ModelAndView(
					3 > 2 ? "TigerView" : "LionView");		// LionView�� ������
			
			mv.addObject("name", "������");
			mv.addObject("age", 1000);
			return mv;	// ������ mv�� ����
		}
		
		
		// ���ο� ����12
		// �� ������� ��ü ������
		@RequestMapping("/t12")
		public String method12(Model model, Person person) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
			model.addAttribute("ppp", person);
			
			LinkedList<String> mm = new LinkedList<String>();
			mm.add("��ġ1");
			mm.add("��ġ2");
			mm.add("��ġ3");
			model.addAttribute("mmmm", mm);
			
			return "LionView";
			
			// �迭����, LinkedList�� ���� ����
		}
		
		
		
}









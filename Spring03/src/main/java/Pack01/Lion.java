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
	// 새로운 매핑8
		@RequestMapping("/t8")
		public String method01(
				Model model,
				HttpServletRequest r
				) {
			// 최종적으로 받을 친구들
			String name = r.getParameter("name");
			String age = r.getParameter("age");	
			System.out.println("함수콜8"+name+age);
			
			model.addAttribute("name", name);
			model.addAttribute("age", age);
			return "LionView";
		}
		
		
		// 새로운 매핑9
		// 컨트롤러에서 View로 값을 던지는 다른 방법2
		// 함수 안에서 객체를 생성해서 값을 전달함
		@RequestMapping("/t9")
		public ModelAndView method02() {
			System.out.println("test");
			ModelAndView mv = new ModelAndView("LionView");		// LionView로 가세요
			
			
			
			mv.addObject("name", "긴꼬리원숭이");
			mv.addObject("age", 3000);
			return mv;	// 리턴을 mv로 받음
		}
		
		
		// 새로운 매핑10
		// 매핑9랑 동일하지만 삼항연산자 테크닉으로 한다면 매핑10으로 하셈
		// 삼항연산자로 밑에 조건식이 맞아서 TigerView로 값을 던져줌
		@RequestMapping("/t10")
		public ModelAndView method03() {
			System.out.println("test");
			ModelAndView mv = new ModelAndView(
					3 > 2 ? "TigerView" : "LionView");		// LionView로 가세요
			
			mv.addObject("name", "강아지");
			mv.addObject("age", 1000);
			return mv;	// 리턴을 mv로 받음
		}
		
		
		// 새로운 매핑12
		// 모델 방법으로 객체 던지기
		@RequestMapping("/t12")
		public String method12(Model model, Person person) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
			model.addAttribute("ppp", person);
			
			LinkedList<String> mm = new LinkedList<String>();
			mm.add("까치1");
			mm.add("까치2");
			mm.add("까치3");
			model.addAttribute("mmmm", mm);
			
			return "LionView";
			
			// 배열전송, LinkedList도 전송 가능
		}
		
		
		
}









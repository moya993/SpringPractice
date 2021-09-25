package Pack01;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller 넣어주면 이제 밑에 Tiger 클래스는 컨트롤러로 인식됨
@Controller
public class Tiger {
	@RequestMapping("/t1")
	// 쌍으로 짝지어 주는 걸 매핑이라함("/t1"과 method를 연결(매핑)해줌)
	// 매핑 함수 뒤에 어디서 불러줄지 값을 넣어줌
	// 외부에서 t1을 부르면 이제 밑에 method01함수가 호출됨
	public String method01() {
		// 안에 DAO가 들어와야 함

		System.out.println("함수 콜1");
		return null; // 함수 만들었을 때 오류를 피하려면 일단 null값으로 리턴을 주셈
	}

	// 새로운 매핑3
	@ResponseBody // Body라는 어노텐션 걸어주면
	@RequestMapping("/t2")
	public String method03() {
		// 안에 DAO가 들어와야 함

		System.out.println("함수콜3");
		// 컨트롤러 이름(Tiger)에 맞춰서 이름을 지어주는것이 관례
		return "Tiger Call"; // 내가 갈 jsp파일명을 적어주셈, TigerView.jsp 파일로 보내줌
	}

	// 새로운 매핑2
	@RequestMapping("/t3")
	public String method02() {
		// 안에 DAO가 들어와야 함

		System.out.println("함수콜2");
		// 컨트롤러 이름(Tiger)에 맞춰서 이름을 지어주는것이 관례
		return "TigerView"; // 내가 갈 jsp파일명을 적어주셈, TigerView.jsp 파일로 보내줌

	}

	// 새로운 매핑4
	@ResponseBody // Body라는 어노텐션 걸어주면
	@RequestMapping("/t4")
	public String method04(
			// 밑에 RequestParam은 index에서 보낸 name(코끼리)이 Controller(Tiger.java)로 넘어오는지 확인하기 위함
			@RequestParam(value = "name") String name // value=name이 index의 name(코끼리)를 뒤 String의 name에 초기화
	) {
		System.out.println("함수콜4 " + name);
		// 컨트롤러 이름(Tiger)에 맞춰서 이름을 지어주는것이 관례
		return "TigerView"; // 내가 갈 jsp파일명을 적어주셈, TigerView.jsp 파일로 보내줌
	}

	// 새로운 매핑5
	@RequestMapping("/t5")
	public String method05(
			// 밑에 RequestParam은 index에서 보낸 name(코끼리)이 Controller(Tiger.java)로 넘어오는지 확인하기 위함
			@RequestParam(value = "name") String name, // value=name이 index의 name(코끼리)를 뒤 String의 name에 초기화
			@RequestParam(value = "age") int age) 
	{
		System.out.println("함수콜5 " + name + " " + age);
		return "TigerView";
	}

	// 새로운 매핑6
	@RequestMapping("/t6")
	public String method06(
			// ServletRequest로 받으면 객체를 한번에 다 받을 수 있음
			HttpServletRequest request) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("함수콜6" + name + age);
		return "TigerView"; // 내가 갈 jsp파일명을 적어주셈, TigerView.jsp 파일로 보내줌
	}

	// 새로운 매핑7
	// Controller에서 TigerView로 데이터를 전달하겠다.
	@RequestMapping("/t7")
	public String method07(Model model) {	// 모델 객체 생성
		model.addAttribute("name", "앵무새");
		model.addAttribute("age", "50");
		System.out.println("함수콜7");
		return "TigerView";		// return TigerView를 해줄 때 위 model들은 같이 TigerView로 넘어감
	}
	
	

}










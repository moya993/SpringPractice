package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// @Controller 넣어주면 이제 밑에 Tiger 클래스는 컨트롤러로 인식됨
@Controller

public class Tiger {
	// 쌍으로 짝지어 주는 걸 매핑이라함("/t1"과 method를 연결(매핑)해줌)
	// 매핑 함수 뒤에 어디서 불러줄지 값을 넣어줌
	// 외부에서 t1을 부르면 이제 밑에 method01함수가 호출됨
	@RequestMapping("/t1")
	public String method01() {
		// 안에 DAO가 들어와야 함
		
		System.out.println("함수 콜1");
		return null;	// 함수 만들었을 때 오류를 피하려면 일단 null값으로 리턴을 주셈
	}
	
	// 새로운 매핑2
	@RequestMapping("/t2")
	public String method02() {
		// 안에 DAO가 들어와야 함
		
		System.out.println("함수 콜2"); 
		// 컨트롤러 이름(Tiger)에 맞춰서 이름을 지어주는것이 관례 
		return "TigerView";	// 내가 갈 jsp파일명을 적어주셈, TigerView.jsp 파일로 보내줌
	
	
	}
	
	
}


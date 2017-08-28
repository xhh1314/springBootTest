package springBootTest.test01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThisWillActuallyRun {
	@RequestMapping("/")
	String home (){
		return "hello word!";
	}

}

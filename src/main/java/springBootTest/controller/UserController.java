package springBootTest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import springBootTest.domain.User;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		System.out.println("execute demo!");
		User user=new User();
		
		ModelAndView model=new ModelAndView("springboot/login");
		//model.addObject("user",user);
		return "springboot/login";
	}
	//@Value("${my.server.address}")
	private String serverAddress;
	
	@RequestMapping("/testYaml")
	public String testYaml(){
		
		System.out.println(serverAddress);
		return null;
	}

}

package com.example.demo.demogom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class DemoContoller {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	private AuthenticationService  authenticationservice;
	public DemoContoller(AuthenticationService authenticationservice) {
		super();
		this.authenticationservice = authenticationservice;
	}
	@RequestMapping("/demo")
	@ResponseBody
	public String demo() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>HTML page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First body ");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();	
	}
	@RequestMapping(value="democheck", method= RequestMethod.GET)
	public String demo1() {
		return "sayHello";
			
	}
	@RequestMapping(value="democheck", method= RequestMethod.POST)
	public String demo2(@RequestParam String name, @RequestParam String password, ModelMap model) 
	{
		if(authenticationservice.authenticate(name,password)) {
	    model.put("name",name);
		model.put("password",password);
		return "welcome";
		}
		
		model.put("errorMessage", "Invalid cred! Please try again");
		
		return "sayHello";
			
	}
	

}

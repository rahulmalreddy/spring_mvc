package springmvccontroller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvcmodel.User;
import springmvs.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("printing");
		model.addAttribute("name","Rahul Reddy");
		model.addAttribute("id", 2000);
		
		
//		List <String> friends = new ArrayList<String>();
//		friends.add("varun");
//		friends.add("kumar");
//		model.addAttribute("f",friends);
//	
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() 
	{
		System.out.println("calling about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
	
		ModelAndView modelandview = new ModelAndView();
		
		modelandview.addObject("name","varun");
		modelandview.addObject("id",2222);
		
		modelandview.setViewName("help");
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(22);
		marks.add(444);
		marks.add(222);
		
		modelandview.addObject("marks");
		
		return modelandview;
	}
	
	@ModelAttribute
	public void common(Model m)
	{
		m.addAttribute("Header","these is LoginPage");
		m.addAttribute("Desc","these is description page");
	}
	
	
	@RequestMapping("/login")
	public String login(Model m)
	{
//		m.addAttribute("Header","these is LoginPage");
//		m.addAttribute("Desc","these is description page");
		
		return "login";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String processform(@ModelAttribute User user,
			                  Model model)
	{
		
//		model.addAttribute("Header","these is LoginPage");
//		model.addAttribute("Desc","these is description page");
		
//		System.out.println(fname);
//		System.out.println(mail);
//		System.out.println(password);
		
//		User user = new User();
//		user.setFname(fname);
//		user.setMail(mail);
//		user.setPassword(password);
		
//		model.addAttribute("name", fname);
//		model.addAttribute("mail",mail);
//		model.addAttribute("password",password);
		
		System.out.println(user);
		this.userservice.createUser(user);
		
//		model.addAttribute(user);
		return "success";
	}
	
	
	
	

}
/*
@RequestMapping("/login")
public String login()
{
	return "login";
}

@RequestMapping(path="/processform",method=RequestMethod.POST)
public String processform(@RequestParam("fname") String fname,
		                  @RequestParam("mail") String mail,
		                  @RequestParam("password") String password,
		                  Model model)
{
//	System.out.println(fname);
//	System.out.println(mail);
//	System.out.println(password);
	
	User user = new User();
	user.setFname(fname);
	user.setMail(mail);
	user.setPassword(password);
	
//	model.addAttribute("name", fname);
//	model.addAttribute("mail",mail);
//	model.addAttribute("password",password);
	
	model.addAttribute(user);
	return "success";
}


}*/














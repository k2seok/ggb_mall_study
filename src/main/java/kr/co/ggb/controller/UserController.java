package kr.co.ggb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ggb.service.CategoryService;
import kr.co.ggb.service.UserService;

@Controller
// @RequestMapping("/*")
public class UserController {

	@Autowired
	UserService userServiceImpl;

	@Autowired
	CategoryService categoryServiceImpl;

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public ModelAndView loginUser(HttpServletRequest request, @RequestParam("userId") String userId,
			@RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView("main");

		int result = userServiceImpl.loginUser(request.getSession(), userId, password);
		if (result < 1)
			mv.setViewName("login");

		return mv;
	}
	@RequestMapping(value = "/loginForm")
	public String loginForm(){
		return "loginForm";
	}
	@RequestMapping(value = "/logout", method = { RequestMethod.GET }) /// Call
																		/// use
																		/// "/logout"
	public String logoutUser(HttpServletRequest request) {
		String 다음뷰 = "login";

		userServiceImpl.logoutUser(request.getSession());
		return 다음뷰;
	}

	@RequestMapping(value = "/category", method = { RequestMethod.GET })
	public String categoryTest(Model model) {
		String 다음뷰 = "category";
		model.addAttribute("category", categoryServiceImpl.category());

		return 다음뷰;
	}

}

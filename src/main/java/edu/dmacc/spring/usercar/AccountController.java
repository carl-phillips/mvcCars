package edu.dmacc.spring.usercar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	@Autowired AccountDio dio;
	
	@RequestMapping(value = "/account")
		public ModelAndView account() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("accountForm");
		modelAndView.addObject("account", new Account());
		return modelAndView;
	}
	
	@Bean
	public AccountDio dio() {
		AccountDio bean = new AccountDio();
		return bean;
	}
}

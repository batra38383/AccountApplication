package org.gurjinder.accountApplication;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class AccountController implements ApplicationContextAware {
	 
		private ApplicationContext context;
	    @RequestMapping(value="/demo", method = RequestMethod.GET)
		public @ResponseBody String accountRequest(ModelMap model) {
	 
			model.addAttribute("msg", "Spring 3 MVC Hello World");
			return "AccountStart";
		}
	    
	    @RequestMapping(value="/addCustomer/", method= RequestMethod.POST)
	    public @ResponseBody Customer getCustomer(@ModelAttribute("customer") Customer customer){
	    	
	    	//ApplicationContext context = new ClassPathXmlApplicationContext("/WEB_INF/mvc-dispatcher-servlet.xml");
	    	//CustomerAddress address = (CustomerAddress) context.getBean("address");
	    	//Customer customer = new Customer();
	    	//customer.setName(name.get("name"));
	    	//customer.setAdress(address);
	    	return customer;
	    	
	    }

		public void setApplicationContext(ApplicationContext applicationContext)
				throws BeansException {
			this.context = applicationContext;
			
		}

}

/**
 * 
 */
package cmc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author TrungNV CMC Soft Dec 6, 2017 9:48:52 AM
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}
}
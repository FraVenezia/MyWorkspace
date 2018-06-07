package it.begear.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MioController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String print()  {
		return "index";

	}

	@RequestMapping(value="/micro", method = RequestMethod.GET)
	public @ResponseBody String getMicro() {
		System.out.println("Sono Dentro");
		return "pippo";
	}

}

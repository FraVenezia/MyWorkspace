package com.begear.it.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.begear.it.model.DescrizioneTesto;

@Controller
public class ControllerApp {

	@Autowired
	@Qualifier("descr2")
	private DescrizioneTesto testo;

	private Logger log = Logger.getLogger(ControllerApp.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome() {
		log.info("Call Welcome Method : Get request");
		return new ModelAndView("welcomePage", "welcomeMessage", testo.getMessaggio());
	}

}

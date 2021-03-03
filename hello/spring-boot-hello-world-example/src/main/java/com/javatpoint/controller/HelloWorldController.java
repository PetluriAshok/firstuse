package com.javatpoint.controller;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.bean.Mobilespecs;
import com.javatpoint.dao.MobileDaoImpl;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MobileDaoImpl mobileDaoImpl;

	@RequestMapping("/")
	public String hello() {
		return "Hello javaTpoint";
	}

	@RequestMapping(value = "/work")
	public String apoo() {

		return "fghjnbvfty";

	}

	@RequestMapping(value = "/getspecs")
	public List<Mobilespecs> getallspecs() {

		List<Mobilespecs> details = mobileDaoImpl.getspecs();

		return details;

	}
}

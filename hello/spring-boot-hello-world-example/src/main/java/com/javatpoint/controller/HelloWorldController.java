package com.javatpoint.controller;

import java.util.List;

import javax.print.DocFlavor.STRING;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.bean.Mobilespecs;
import com.javatpoint.bean.MobilespecsDto;
import com.javatpoint.dao.MobileDaoImpl;


@RestController
public class HelloWorldController {

	@Autowired
	private MobileDaoImpl mobileDaoImpl;

//	@Autowired
//	private MobilespecsRepository mobilespecsRepository;

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

//	@RequestMapping(value = "/addmobile", method = RequestMethod.POST)
//	public MobilespecsDto addspecs(@Valid @RequestBody MobilespecsDto mobilespecs) {
//
//		MobilespecsDto mobilespecs2 = mobilespecsRepository.save(mobilespecs);
//
//		return mobilespecs2;
//
//	}
}

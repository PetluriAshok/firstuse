package com.javatpoint.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.bean.Mobilespecs;

@Service
public class MobileDaoImpl {

	@Autowired
	private Mobilespecsdao mobilespecsdao;

	public List<Mobilespecs> getspecs() {
		return mobilespecsdao.getspecs();

	}

}

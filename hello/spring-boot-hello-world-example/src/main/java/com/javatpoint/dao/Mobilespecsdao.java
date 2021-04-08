package com.javatpoint.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javatpoint.bean.Mobilespecs;
import com.javatpoint.utilityes.MobileRowmapper;

@Repository
public class Mobilespecsdao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	private MobilespecsRepository mobilespecsRepository;


	public Mobilespecsdao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Mobilespecs> getspecs() {

		String sql = "select * from  mobilespecs";

		return jdbcTemplate.query(sql, new MobileRowmapper());

	}


//	public String additem(String mobilename, String mobilespecs) {
//		return mobilespecsRepository.save(mobilename,mobilespecs) ;
//
//		
//
//	}

}

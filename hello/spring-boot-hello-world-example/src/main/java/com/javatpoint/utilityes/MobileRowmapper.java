package com.javatpoint.utilityes;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.bean.Mobilespecs;

public class MobileRowmapper implements RowMapper<Mobilespecs> {

	@Override
	public Mobilespecs mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Mobilespecs mobilespecs=new Mobilespecs();
		
		mobilespecs.setMobilename(rs.getString("mobilename"));
		mobilespecs.setMobile_specs(rs.getString("mobilespec"));
		
		return mobilespecs;
	}

}

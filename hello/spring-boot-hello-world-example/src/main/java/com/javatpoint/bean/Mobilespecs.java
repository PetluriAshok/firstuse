package com.javatpoint.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Mobilespecs {


	private String mobilename;

	public String mobile_specs;

	public String getMobilename() {
		return mobilename;
	}

	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}

	public String getMobile_specs() {
		return mobile_specs;
	}

	public void setMobile_specs(String mobile_specs) {
		this.mobile_specs = mobile_specs;
	}

}

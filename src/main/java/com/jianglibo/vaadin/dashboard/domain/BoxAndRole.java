package com.jianglibo.vaadin.dashboard.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "singleInstallation")
public class BoxAndRole extends BaseEntity {
	
	private Box box;
	
	private String role;

	public Box getBox() {
		return box;
	}

	public void setBox(Box box) {
		this.box = box;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}
}
/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.helloweenvsfei.struts.form;

import org.apache.struts.action.ActionForm;

import com.helloweenvsfei.struts.bean.Person;

/**
 * MyEclipse Struts Creation date: 05-05-2008
 * 
 * XDoclet definition:
 * 
 * @struts.form name="tileForm"
 */
public class TileForm extends ActionForm {

	private static final long serialVersionUID = -4733391384669037577L;

	private String action;

	private Person person = new Person();

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //to avoid no qualifying bean exception we need to use this annotation
@Scope(value="prototype")//to generate multiple objects we need to use Scope annotation
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired //to identify the object based on type
	@Qualifier("lap1") //to identify the object based on name
	private Laptop laptop;
	
	//got this constructor to print whether the object was created or not..
	//right click->Source->get constructor
	public Alien() {
		super();
		System.out.println("object created...");
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show() {
		System.out.println("in show");
		System.out.println(laptop.toString());
		laptop.compile();
		
	}
	
}

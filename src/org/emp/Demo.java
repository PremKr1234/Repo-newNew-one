 package org.emp;

public class Demo {
	int id;
	String name;
	long phone;
	
	public  Demo(int id,String name,long phone) {
		this.id=id;
		this.name=name;
		this.phone=phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
}
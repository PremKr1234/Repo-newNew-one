package org.emp;

public class Employee {
	String name;

	public String getName() {
		return"My Name is: "+ name;
	}

	public void setName(String name) {
		if (name.startsWith("p")) {
			this.name = name;
			
		}
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("prem");
		System.out.println(e.getName());
	}
		
	}

	
package org.emp;

import java.util.ArrayList;
import java.util.List;

public class Details {
	public static void main(String[] args) {
		
		Demo e1 = new Demo(10,"PremKr",8610418228l);
		Demo e2 = new Demo(20,"Rajiv",7867897678l);
		Demo e3 = new Demo(30,"Sathya",89076589879l);
		
		List<Demo>li = new ArrayList<Demo>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		System.out.println("id is "+li.get(0).getId());
		System.out.println("Name is "+li.get(1).getName());
		System.out.println("Mobile Nu is "+li.get(2).getPhone());
		System.out.println("ksjdlsdvbladshf");
		System.out.println("hello");
		
		
	}

}

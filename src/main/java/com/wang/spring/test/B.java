package com.wang.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public class B {
	
	private A a;
	
	@Autowired
	public B(A a){
		System.out.println("class B");
		this.a = a;
		
		//new B();
	}

	public A getA(){
		return a;
	}
	
}

package com.wang.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public class A {
	
	private B b;
	
	@Autowired
	public A(B b){
		System.out.println("class A");
		this.b = b;
		
		//new A();
	}
	
	public B getB(){
		return b;
	}

}

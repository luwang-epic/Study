package com.wang.spring.test;

import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 *  不管是单例模式还是原型模式    不管是在构造函数传入还是在构造函数内部相互创建对象   都无法初始化  报错
 *  只是在构造函数内部相互创建对象 会导致栈溢出错误    
 *  而 构造函数传入Spring可以检测出来 报UnsatisfiedDependencyException异常
 *  
 *  set/get方式的注入  可以循环注入
 * 
 */

//测试Spring相互依赖的问题
public class Test {
	
	private static ApplicationContext ac = null;
	
	@BeforeClass
	public static void beforeClass(){
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@org.junit.Test
	public void test(){
		System.out.println(ac.getBean("a"));
	}
	
}

package com.cts.spring.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		FirstBean fb = (FirstBean) context.getBean("firstBean");
		fb.test();
		SecondBean sb = (SecondBean) context.getBean("secondBean");
		sb.test();
		
		
		/*FirstBean fb = (FirstBean) context.getBean("firstBean");
		fb.setX(12);
		fb.test();
		FirstBean fb2 = (FirstBean) context.getBean("firstBean");
		fb2.setX(34);
		fb2.test();
		SecondBean sb = (SecondBean) context.getBean("secondBean");
		sb.test();*/
	}
}

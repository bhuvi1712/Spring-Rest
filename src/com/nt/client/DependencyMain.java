package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator wmg=ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg.generateMessage("Bhuvanesh"));
		ctx.close();
	}

}

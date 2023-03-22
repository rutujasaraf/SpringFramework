package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("beans.xml");
		
		BeanFactory bf = new XmlBeanFactory(r);
		
		bf.getBean("s");

	}

}

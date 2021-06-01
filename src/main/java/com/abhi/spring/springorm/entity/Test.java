package com.abhi.spring.springorm.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.spring.springorm.product.dao.ProductDao;
import com.abhi.spring.springorm.product.entity.Product;

public class Test {
  
	 public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/springorm/entity/config.xml");
		 ProductDao productDao = (ProductDao) ctx.getBean("productdao");
		 Product product = new Product();
		 product.setId(1);
		 product.setName("iphone");
		 product.setDesc("Awesome00");
		 product.setPrice(7000);
		 productDao.create(product);
	 }
}

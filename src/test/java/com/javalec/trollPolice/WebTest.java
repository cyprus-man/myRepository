package com.javalec.trollPolice;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.javalec.dao.DiscussionBoardDao;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
      "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class WebTest {
   @Autowired
   ApplicationContext context;
   
   @Autowired
   DiscussionBoardDao discBoardDao;
   
   @Test @Ignore
   public void test() {
      System.out.println(context);
      for(String name : context.getBeanDefinitionNames())
         System.out.println("beanName"+name);
   }
   
   @Test 
   public void getDiscBoardListTest()
   {
	   discBoardDao.list(1);
   }
}


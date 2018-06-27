package cn.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.spring.dao.UserDao;

public class UserDaoTest {

	@Test
	public void test(){
		//加载配置文件
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
		//通过容器获得初始化对象
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		userDao.say();
	}
}
